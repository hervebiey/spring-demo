package com.imanuwel.springdemo;

public class MyApp {
    public static void main(String[] args) {

        // Create the object
        Coach coach = new TrackCoach();

        // Use the object
        System.out.println(coach.getDailyWorkout());
    }
}
