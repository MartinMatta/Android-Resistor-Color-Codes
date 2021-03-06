package com.example.resistorcalculator.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;


import com.example.resistorcalculator.Colors;
import com.example.resistorcalculator.R;
import com.example.resistorcalculator.Resistor;

public class FragmentBAND6 extends Resistor {

    private View value1;
    private View value2;
    private View value3;
    private View multiplier;
    private View tolerance;
    private View temperatureCoef;

    Button btn_value1;
    Button btn_value2;
    Button btn_value3;
    Button btn_multiplier;
    Button btn_tolerance;
    Button btn_coefficient;

    TextView textView;

    Colors c = new Colors();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.band6_layout, container, false);

        value1 = view.findViewById(R.id.value1);
        value2 = view.findViewById(R.id.value2);
        value3 = view.findViewById(R.id.value3);
        multiplier = view.findViewById(R.id.multiplier);
        tolerance = view.findViewById(R.id.tolerance);
        temperatureCoef = view.findViewById(R.id.temperature_coef);

        textView = (TextView)view.findViewById(R.id.textView3);

        btn_value1 = (Button)view.findViewById(R.id.btn_band6_value1);
        btn_value2 = (Button)view.findViewById(R.id.btn_band6_value2);
        btn_value3 = (Button)view.findViewById(R.id.btn_band6_value3);
        btn_multiplier = (Button)view.findViewById(R.id.btn_band6_multiplier);
        btn_tolerance = (Button)view.findViewById(R.id.btn_band6_tolerance);
        btn_coefficient = (Button)view.findViewById(R.id.btn_band6_coefficient);

        loadViewParameter(textView, getActivity(), 6);

        btn_value1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(1, btn_value1, value1);
            }
        });

        btn_value2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(2, btn_value2, value2);
            }
        });

        btn_value3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(3, btn_value3, value3);
            }
        });

        btn_multiplier.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(4, btn_multiplier, multiplier);
            }
        });

        btn_tolerance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(5, btn_tolerance, tolerance);
            }
        });

        btn_coefficient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(6, btn_coefficient, temperatureCoef);
            }
        });


        return view;
    }
}
