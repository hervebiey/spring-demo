package com.imanuwel.springdemo.javacodeconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.imanuwel.springdemo.javacodeconfiguration")
@PropertySource("classpath:java-code-configuration/application.properties")
public class SportConfig {

    // Define Bean for strength scripture service
    @Bean
    public ScriptureService strengthScriptureService() {
        return new StrengthScriptureService();
    }

    // Define Bean for swim coach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(strengthScriptureService());
    }
}
