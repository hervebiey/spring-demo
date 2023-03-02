package com.imanuwel.springdemo.xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml-configuration/applicationContext.xml");

        // Retrieve Bean from Spring container
        CricketCoach coach = context.getBean("myCricketCoach", CricketCoach.class);

        // Call methods on the Bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        // Call our new methods to get the literal values

        System.out.println(coach.getEmailAddress());

        System.out.println(coach.getTeam());

        // Close the context
        context.close();
    }
}
