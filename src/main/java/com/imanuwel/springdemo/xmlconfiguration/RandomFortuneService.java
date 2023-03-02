package com.imanuwel.springdemo.xmlconfiguration;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

    // Create an array of strings
    private String[] data = {
            "This is line 1",
            "This is line 2",
            "This is line 3"
    };

    // Create a random number generator
    private Random random = new Random();

    @Override
    public String getFortune() {
        // Pick a random string from the array
        int index = random.nextInt(data.length);
        return data[index];
    }
}
