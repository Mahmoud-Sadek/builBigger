package com.example.amiraahabeeb.joketeller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.MyJoker;
import com.example.amiraahabeeb.jokefactory.DisplayJokeActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        /*public void launchJokeActivity(View view) {
            EndpointAsyncTask endpointsAsyncTask = new EndpointAsyncTask(this);
            endpointsAsyncTask.execute();
        }*/
}
