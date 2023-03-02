package com.imanuwel.springdemo.javacodeconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
    public static void main(String[] args) {

        // Read Spring config class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Get the Bean from Spring container
        Coach coach = context.getBean("swimCoach", Coach.class);

        // Call a method on the Bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyScripture());

        // Close the context
        context.close();
    }
}
