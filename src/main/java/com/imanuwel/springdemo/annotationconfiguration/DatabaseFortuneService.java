package com.imanuwel.springdemo.annotationconfiguration;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements ScriptureService {

    @Override
    public String getScripture() {
        return null;
    }
}
