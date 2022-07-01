package com.example.kuliner311910197;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toolbar;

public class SplashScreenActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent utamaIntent = new Intent (SplashScreenActivity.this, MainActivity.class);
                startActivity (utamaIntent) ;
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}