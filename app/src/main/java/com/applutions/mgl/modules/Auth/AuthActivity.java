package com.applutions.mgl.modules.Auth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.applutions.mgl.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class AuthActivity extends AppCompatActivity {
    TabLayout tabs;
    NavController controller;
    NavHostFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        fragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_auth_activity);
        controller = NavHostFragment.findNavController(fragment);
        tabs = findViewById(R.id.auth_tabs);
        tabs.addTab(tabs.newTab().setText("Login"));
        tabs.addTab(tabs.newTab().setText("Sign Up"));
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getText().equals("Login")){
                    controller.navigate(R.id.action_signup_to_login);
                }
                else if (tab.getText().equals("Sign Up")){
                    controller.navigate(R.id.action_login_to_signup);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    public TabLayout getTabs() {
        return tabs;
    }
}