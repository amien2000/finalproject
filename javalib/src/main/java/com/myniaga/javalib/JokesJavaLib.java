package com.myniaga.javalib;

import java.util.Random;

public class JokesJavaLib {

    private String[] jokes;
    private Random random;

    public JokesJavaLib() {
        jokes = new String[5];
        jokes[0] = "My doctor told me that I need to exercise in the morning. " +
                "So I told myself I need a new doctor.";
        jokes[1] = "While eating Chinese takeout one evening, " +
                "my son noticed there was no fortune in his cookie. " +
                "\"Oh, how unfortunate!\" he exclaimed.";
        jokes[2] = "Another term for camping should be \"arguing outside.\"";
        jokes[3] = "Q: What do vegetarian zombies eat?\n" +
                "A: GRAIIIIIIINS!";
        jokes[4] = "A man loses his dog, so he puts an ad in the paper, and the ad says: \"Here, boy.\"";
        random = new Random();
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
