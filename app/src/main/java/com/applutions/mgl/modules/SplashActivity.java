package com.applutions.mgl.modules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.applutions.mgl.R;
import com.applutions.mgl.modules.Auth.AuthActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        CountDownTimer countDownTimer=new CountDownTimer(2000,1000) {
            @Override
            public void onTick(long l)
            {
            }

            @Override
            public void onFinish()
            {
                Intent myIntent = new Intent(SplashActivity.this, AuthActivity.class);
                startActivity(myIntent);
            }
        }.start();
    }
}