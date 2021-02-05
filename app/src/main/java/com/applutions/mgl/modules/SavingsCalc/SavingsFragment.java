package com.applutions.mgl.modules.SavingsCalc;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.applutions.mgl.R;
import com.google.android.material.slider.Slider;
import com.google.android.material.tabs.TabLayout;

public class SavingsFragment extends Fragment {

    TabLayout tabs;
    ConstraintLayout calc, prices;
    Slider price, mileage, daily;
    TextView priceVal, mileageVal, dailyVal;
    public SavingsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViews(view);
        addChangeListeners();
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getText().equals("Calculator")){
                    calc.setVisibility(View.VISIBLE);
                    prices.setVisibility(View.GONE);
                }
                else if (tab.getText().equals("CNG Prices")){
                    calc.setVisibility(View.GONE);
                    prices.setVisibility(View.VISIBLE);
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

    private void addChangeListeners() {
        price.addOnChangeListener((slider, value, fromUser) -> priceVal.setText(getString(R.string.rupee)+String.format("%.2f", value)+"/Kg"));
        mileage.addOnChangeListener((slider, value, fromUser) -> mileageVal.setText(String.format("%.0f", value)+"Km/l"));
        daily.addOnChangeListener((slider, value, fromUser) -> dailyVal.setText(String.format("%.0f", value)+"Km/l"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_savings, container, false);
    }

    private void findViews(View view){
        tabs = view.findViewById(R.id.tab_layout);
        calc = view.findViewById(R.id.calculator_sliders);
        prices = view.findViewById(R.id.cng_prices_grp);
        price = view.findViewById(R.id.price_slider);
        mileage = view.findViewById(R.id.mileage_slider);
        daily = view.findViewById(R.id.daily_slider);
        priceVal = view.findViewById(R.id.price_value);
        mileageVal = view.findViewById(R.id.mileage_value);
        dailyVal = view.findViewById(R.id.daily_value);
    }
}