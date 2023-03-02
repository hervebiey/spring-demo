package com.imanuwel.springdemo.annotationconfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HappyScriptureService implements ScriptureService {

    @Override
    public String getScripture() {
        return "Rejoice in the Lord alway: and again I say, Rejoice. - Philippians 4:4 (KJV)";
    }
}
