package com.applutions.mgl.modules.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import com.applutions.mgl.R;

public class HomeActivity extends AppCompatActivity {

    ConstraintLayout aboutCard, savingsCard;
    View aboutFrag, savingsFrag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findViews();
        initialise();
        setClickListeners();
    }

    private void setClickListeners() {
        aboutCard.setOnClickListener(v->{
            if (aboutFrag.getVisibility() == View.GONE)
                aboutFrag.setVisibility(View.VISIBLE);
            else
                aboutFrag.setVisibility(View.GONE);
        });

        savingsCard.setOnClickListener(v->{
            if (savingsFrag.getVisibility() == View.GONE)
                savingsFrag.setVisibility(View.VISIBLE);
            else
                savingsFrag.setVisibility(View.GONE);
        });

    }

    private void initialise() {
        aboutFrag.setVisibility(View.GONE);
        aboutFrag.setClickable(true);

        savingsFrag.setVisibility(View.GONE);
        savingsFrag.setClickable(true);

    }

    private void findViews() {
        aboutCard = findViewById(R.id.about_card);
        aboutFrag = findViewById(R.id.about_frag);

        savingsCard = findViewById(R.id.savings_card);
        savingsFrag = findViewById(R.id.savings_frag);

    }


}