package com.imanuwel.springdemo.annotationconfiguration;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileScriptureService implements ScriptureService {

    private String fileName = "/Users/hervebiey/Documents/IntelliJ/spring-demo/src/main/resources/annotation-configuration/scripture-data.txt";

    private List<String> scriptures;

    // Create a random number generator
    private Random random = new Random();

    public FileScriptureService() {
        File file = new File(fileName);

        System.out.println("Reading fortunes from file: " + file);
		System.out.println("File exists: " + file.exists());

        // Initialize array list
        scriptures = new ArrayList<String>();

        // Read scriptures from file
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                scriptures.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getScripture() {
        // Get a random number based on the array size
        int index = random.nextInt(scriptures.size());

        // Pick a random string from the array
        return scriptures.get(index);
    }
}
