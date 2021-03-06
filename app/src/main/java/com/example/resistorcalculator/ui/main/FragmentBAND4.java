package com.example.resistorcalculator.ui.main;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.resistorcalculator.Colors;
import com.example.resistorcalculator.Resistor;
import com.example.resistorcalculator.R;


public class FragmentBAND4 extends Resistor {

    private View value1;
    private View value2;
    private View multiplier;
    private View tolerance;

    Button btn_value1;
    Button btn_value2;
    Button btn_multiplier;
    Button btn_tolerance;

    TextView textView;

    Colors c = new Colors();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.band4_layout, container, false);

        value1 = view.findViewById(R.id.value1);
        value2 = view.findViewById(R.id.value2);
        multiplier = view.findViewById(R.id.multiplier);
        tolerance = view.findViewById(R.id.tolerance);

        textView = (TextView)view.findViewById(R.id.textView1);

        btn_value1 = (Button)view.findViewById(R.id.btn_band4_value1);
        btn_value2 = (Button)view.findViewById(R.id.btn_band4_value2);
        btn_multiplier = (Button)view.findViewById(R.id.btn_band4_multiplier);
        btn_tolerance = (Button)view.findViewById(R.id.btn_band4_tolerance);

        loadViewParameter(textView, getActivity(), 4);

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
                //putResult(1, 2);
            }
        });

        btn_multiplier.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(4,  btn_multiplier, multiplier);
            }
        });

        btn_tolerance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(5, btn_tolerance, tolerance);
            }
        });

        return view;
    }
}

