package com.example;

import java.util.Random;

public class MyJoker {
    private static final String[] jokes = {
            "Microsoft gives you Windows, Linux gives you a home!"
    };

    public static String getJoke(){
        int size = jokes.length;

        Random r = new Random();
        int index = r.nextInt(size);

        return jokes[index];
    }
}
