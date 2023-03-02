package com.imanuwel.springdemo.javacodeconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        // Read Spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the Bean from Spring container
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        // Call a method on the Bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyScripture());

        System.out.println("Email: " + coach.getEmail());
        System.out.println("Team: " + coach.getTeam());

        // Close the context
        context.close();
    }
}
