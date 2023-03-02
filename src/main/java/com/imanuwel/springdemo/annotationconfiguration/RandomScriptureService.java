package com.imanuwel.springdemo.annotationconfiguration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomScriptureService implements ScriptureService {

    // Create an array of strings
    private String[] data = {
            "Rejoice in the Lord alway: and again I say, Rejoice. - Philippians 4:4 (KJV)",
            "Go thy way, eat thy bread with joy, and drink thy wine with a merry heart; for God now accepteth thy works. - Ecclesiastes 9:7 (KJV)",
            "Delight thyself also in the LORD; and he shall give thee the desires of thine heart. - Psalm 37:4 (KJV)",
            "Happy is that people, that is in such a case: yea, happy is that people, whose God is the LORD. - Psalm 144:15 (KJV)",
            "Then he said unto them, Go your way, eat the fat, and drink the sweet, and send portions unto them for whom nothing is prepared: for this day is holy unto our Lord: neither be ye sorry; for the joy of the LORD is your strength. - Nehemiah 8:10 (KJV)"
    };

    // Create a random number generator
    private Random random = new Random();

    @Override
    public String getScripture() {
        // Get a random number based on the array size
        int index = random.nextInt(data.length);

        // Pick a random string from the array
        return data[index];
    }
}
