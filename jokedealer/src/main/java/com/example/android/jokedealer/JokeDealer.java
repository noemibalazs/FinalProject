package com.example.android.jokedealer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDealer extends AppCompatActivity {

    private TextView mJoke;
    private String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_dealer);

        Intent intent = getIntent();

        if(intent.hasExtra("joke")){
            joke = intent.getStringExtra("joke");

        }

        mJoke = findViewById(R.id.joke);
        mJoke.setText(joke);


    }
}
