package com.udacity.gradle.builditbigger.backend;

import com.myniaga.javalib.JokesJavaLib;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        myData = new JokesJavaLib().getRandomJoke();
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}