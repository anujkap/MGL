package com.applutions.mgl.modules.Auth;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.applutions.mgl.R;
import com.applutions.mgl.modules.Home.HomeActivity;
import com.google.android.material.tabs.TabLayout;

public class LoginFragment extends Fragment {

    TextView linkSignUp;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_login, container, false);
        linkSignUp = root.findViewById(R.id.sign_up_link);
        TabLayout tabs = ((AuthActivity)getActivity()).getTabs();
        linkSignUp.setOnClickListener(v-> tabs.selectTab(tabs.getTabAt(1)));
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button login = view.findViewById(R.id.button_login);
        login.setOnClickListener(v->getActivity().startActivity(new Intent(getActivity(), HomeActivity.class)));
    }
}