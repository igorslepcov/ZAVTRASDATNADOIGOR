package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer t = new Timer();
        TimerTask ts = new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, SignUp.class);
                startActivity(i);
            }
        };
        t.schedule(ts,3000L);
    }
}