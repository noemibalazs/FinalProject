package com.udacity.gradle.builditbigger.backend;

import com.example.android.joketeller.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        return myData;
    }

    public void setData(String data) {

        JokeTeller jokeTeller = new JokeTeller();
        String joke = jokeTeller.getJoke();
        data = joke;
        myData = data;
    }
}