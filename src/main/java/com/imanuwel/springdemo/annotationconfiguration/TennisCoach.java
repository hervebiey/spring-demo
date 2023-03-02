package com.imanuwel.springdemo.annotationconfiguration;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Autowired
    @Qualifier("fileScriptureService")
    private ScriptureService scriptureService;

    /*@Autowired
    public TennisCoach(ScriptureService scriptureService) {
        this.scriptureService = scriptureService;
    }*/

    // Define a default constructor
    public TennisCoach() {
        System.out.println(">> TennisCoach: inside no-arg constructor");
    }

    // Define the init method
    @PostConstruct
    public void startupMethod() {
        System.out.println(">> TennisCoach: inside startupMethod()");
    }

    // Define the destroy method
    @PreDestroy
    public void cleanupMethod() {
        System.out.println(">> TennisCoach: inside cleanupMethod()");
    }

    /*// Define a setter method
    @Autowired
    public void setScriptureService(ScriptureService scriptureService) {
        System.out.println(">> TennisCoach: inside setScriptureService() method");
        this.scriptureService = scriptureService;
    }*/

    /*@Autowired
    public void doSomething(ScriptureService scriptureService) {
        System.out.println(">> TennisCoach: inside setScriptureService() method");
        this.scriptureService = scriptureService;
    }*/

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyScripture() {
        return scriptureService.getScripture();
    }
}
