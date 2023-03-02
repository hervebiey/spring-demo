package com.imanuwel.springdemo.javacodeconfiguration;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private ScriptureService scriptureService;

    public SwimCoach(ScriptureService scriptureService) {
        this.scriptureService = scriptureService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyScripture() {
        return scriptureService.getScripture();
    }
}
