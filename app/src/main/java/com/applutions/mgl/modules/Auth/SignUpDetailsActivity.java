package com.applutions.mgl.modules.Auth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.applutions.mgl.R;
import com.google.android.material.textfield.TextInputLayout;

public class SignUpDetailsActivity extends AppCompatActivity {

    TextInputLayout fnameL, lnameL, street1L, street2L, cityL, stateL, zipL, passwordL;
    EditText fname, lname, street1, street2, city, state, zip, password;
    boolean fnameC, lnameC, street1C, street2C, cityC, stateC, zipC, passwordC;
    int status;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_details);
        status = 1;
        findViews();
        attachWatchers(this);
        setOnClick(this);

    }

    private void attachWatchers(Context context) {
        fname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                fnameC = s.length() > 0;
                if(status==1 && fnameC && lnameC){
                    next.setClickable(true);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.main_button_bg));
                }
                else {
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });
        lname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                lnameC = s.length() > 0;
                if(status==1 && fnameC && lnameC){
                    next.setClickable(true);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.main_button_bg));
                }
                else{
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        street1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                street1C = s.length() > 0;
                if(status==2 && street1C && stateC && cityC && zipC){
                    next.setClickable(true);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.main_button_bg));
                }
                else{
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });
        city.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                cityC = s.length() > 0;
                if(status==2 && street1C && stateC && cityC && zipC){
                    next.setClickable(true);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.main_button_bg));
                }
                else{
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });
        state.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                stateC = s.length() > 0;
                if(status==2 && street1C && stateC && cityC && zipC){
                    next.setClickable(true);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.main_button_bg));
                }
                else{
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });
        zip.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                zipC = s.length() > 0;
                if(status==2 && street1C && stateC && cityC && zipC){
                    next.setClickable(true);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.main_button_bg));
                }
                else{
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.length()>0){
                    next.setClickable(true);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.main_button_bg));
                }
                else{
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void setOnClick(Context context) {
        next.setOnClickListener(v->{
            switch(status){
                case 1:
                    status = 2;
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                    fnameL.setVisibility(View.GONE);
                    lnameL.setVisibility(View.GONE);
                    street1L.setVisibility(View.VISIBLE);
                    street2L.setVisibility(View.VISIBLE);
                    cityL.setVisibility(View.VISIBLE);
                    stateL.setVisibility(View.VISIBLE);
                    zipL.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    status = 3;
                    next.setClickable(false);
                    next.setBackground(ContextCompat.getDrawable(context,R.drawable.inactive_button_bg));
                    street1L.setVisibility(View.GONE);
                    street2L.setVisibility(View.GONE);
                    cityL.setVisibility(View.GONE);
                    stateL.setVisibility(View.GONE);
                    zipL.setVisibility(View.GONE);
                    passwordL.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    //TODO Send SignUp req
                    startActivity(new Intent(context, AccountCreatedActivity.class));
                    break;
            }
        });
    }

    private void findViews() {
        fnameL = findViewById(R.id.fname_layout);
        lnameL = findViewById(R.id.lname_layout);
        street1L = findViewById(R.id.street_layout);
        street2L = findViewById(R.id.street2_layout);
        cityL = findViewById(R.id.city_layout);
        stateL = findViewById(R.id.state_layout);
        zipL = findViewById(R.id.zip_layout);
        passwordL = findViewById(R.id.password_layout);

        fname = findViewById(R.id.et_fname);
        lname = findViewById(R.id.et_lname);
        street1 = findViewById(R.id.et_street);
        street2 = findViewById(R.id.et_street2);
        city = findViewById(R.id.et_city);
        state = findViewById(R.id.et_state);
        zip = findViewById(R.id.et_zip);
        password = findViewById(R.id.et_password);
        next = findViewById(R.id.button_details_next);
    }
}