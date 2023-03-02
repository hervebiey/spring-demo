package com.imanuwel.springdemo.annotationconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {

        // Read Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-configuration/applicationContext.xml");

        // Get the Bean from Spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // Call a method on the Bean
        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyScripture());

        // Close the context
        context.close();
    }
}
