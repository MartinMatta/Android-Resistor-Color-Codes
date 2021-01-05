package com.example.resistorcalculator.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import android.widget.TextView;


import com.example.resistorcalculator.R;
import com.example.resistorcalculator.Resistor;

public class FragmentBAND6 extends Resistor {

    Button btn_value1;
    Button btn_value2;
    Button btn_value3;
    Button btn_multiplier;
    Button btn_tolerance;
    Button btn_coefficient;

    ImageView imageView;
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.band6_layout, container, false);

        textView = (TextView)view.findViewById(R.id.textView3);

        btn_value1 = (Button)view.findViewById(R.id.btn_band6_value1);
        btn_value2 = (Button)view.findViewById(R.id.btn_band6_value2);
        btn_value3 = (Button)view.findViewById(R.id.btn_band6_value3);
        btn_multiplier = (Button)view.findViewById(R.id.btn_band6_multiplier);
        btn_tolerance = (Button)view.findViewById(R.id.btn_band6_tolerance);
        btn_coefficient = (Button)view.findViewById(R.id.btn_band6_coefficient);

        loadViewParameter(imageView, textView, getActivity(), 6);

        btn_value1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                putResult(6, 10, 15);
            }
        });

        btn_value2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            }
        });

        btn_value3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            }
        });

        btn_multiplier.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            }
        });

        btn_tolerance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            }
        });

        btn_coefficient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
            }
        });


        return view;
    }
}
