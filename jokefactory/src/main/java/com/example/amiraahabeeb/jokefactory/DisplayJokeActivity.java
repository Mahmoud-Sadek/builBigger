package com.example.amiraahabeeb.jokefactory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {
    public static String JOKE_KEY = "JOKE_KEY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        TextView jokeTextView = (TextView) findViewById(R.id.joke_text);
        Intent intent = getIntent();
        String joke = intent.getStringExtra(JOKE_KEY);

        if (joke != null && joke.length() != 0) {
            jokeTextView.setText(joke);
        }
    }
}
