package com.applutions.mgl.modules.Auth;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.applutions.mgl.R;
import com.google.android.material.tabs.TabLayout;

public class SignUpFragment extends Fragment {
    TextView linkLogin;

    public SignUpFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_signup, container, false);
        linkLogin = root.findViewById(R.id.login_link);
        TabLayout tabs = ((AuthActivity)getActivity()).getTabs();
        linkLogin.setOnClickListener(v-> tabs.selectTab(tabs.getTabAt(0)));
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText number;
        Button signUp;
        number = view.findViewById(R.id.et_mobile_sign_up);
        signUp = view.findViewById(R.id.button_sign_up);
        number.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length()==10){
                    signUp.setClickable(true);
                    signUp.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.main_button_bg));
                }
                else{
                    signUp.setClickable(false);
                    signUp.setBackground(ContextCompat.getDrawable(getContext(),R.drawable.inactive_button_bg));
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });

        signUp.setOnClickListener(v-> getActivity().startActivity(new Intent(getActivity(), SignUpDetailsActivity.class)));
    }
}