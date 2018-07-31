package com.example.android.jokedealer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeDealer extends AppCompatActivity {

    private TextView mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_dealer);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");

        mJoke = findViewById(R.id.joke);
        mJoke.setText(joke);


    }
}
