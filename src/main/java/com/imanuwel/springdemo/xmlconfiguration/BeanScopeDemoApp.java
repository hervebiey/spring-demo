package com.imanuwel.springdemo.xmlconfiguration;

import com.imanuwel.springdemo.xmlconfiguration.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml-configuration/beanScope-applicationContext.xml");

        // Retrieve Bean from Spring container
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // Check if they are the same
        boolean result = coach == alphaCoach;
        // Print out the result
        System.out.println("\nPointing to the same object: " + result);

        System.out.println("\nMemory location for coach: " + coach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

        // Close the context
        context.close();
    }
}
