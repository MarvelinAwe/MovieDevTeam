package com.nyx.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3500);
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                    finish();
                } catch (Exception e) {

                }
            }


        }; thread.start();
    }
}