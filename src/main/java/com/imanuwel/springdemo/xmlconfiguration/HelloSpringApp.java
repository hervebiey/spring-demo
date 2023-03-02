package com.imanuwel.springdemo.xmlconfiguration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xml-configuration/applicationContext.xml");

        // Retrieve Bean from Spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        // Call methods on the Bean
        System.out.println(coach.getDailyWorkout());

        // Call the new method for fortunes
        System.out.println(coach.getDailyFortune());

        // Close the context
        context.close();
    }
}
