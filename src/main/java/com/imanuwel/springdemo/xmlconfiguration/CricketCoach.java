package com.imanuwel.springdemo.xmlconfiguration;

public class CricketCoach implements Coach {

    // Add fields for emailAddress and team
    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    // Create a no-arg constructor

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    // Create a setter method
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
