package com.applutions.mgl.modules.Auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.applutions.mgl.R;

public class AccountCreatedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_created);
        Button next = findViewById(R.id.button_next);
        next.setOnClickListener(v->startActivity(new Intent(this, AuthActivity.class)));
    }
}