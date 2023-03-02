package com.imanuwel.springdemo.annotationconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // Load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotation-configuration/applicationContext.xml");

        // Retrieve Bean from Spring container
        Coach coach1 = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        // Check if they are the same
        // Print out the results
        System.out.println("\nPointing to the same object: " + (coach1 == coach2));

        System.out.println("\nMemory location for Coach 1: " + coach1);
        System.out.println("\nMemory location for Coach 2: " + coach2 + "\n");

        // Close the context
        context.close();
    }
}
