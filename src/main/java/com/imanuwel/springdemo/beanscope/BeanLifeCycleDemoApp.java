package com.imanuwel.springdemo.beanscope;

import com.imanuwel.springdemo.xmlconfiguration.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // Retrieve Bean from Spring container
        Coach coach = context.getBean("myCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
