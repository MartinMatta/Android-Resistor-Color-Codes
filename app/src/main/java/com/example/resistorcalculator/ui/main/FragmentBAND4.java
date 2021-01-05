package com.example.resistorcalculator.ui.main;

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


import com.example.resistorcalculator.Resistor;
import com.example.resistorcalculator.R;


public class FragmentBAND4 extends Resistor {

    Button btn_value1;
    Button btn_value2;
    Button btn_multiplier;
    Button btn_tolerance;

    ImageView imageView;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.band4_layout, container, false);

        textView = (TextView)view.findViewById(R.id.textView1);

        btn_value1 = (Button)view.findViewById(R.id.btn_band4_value1);
        btn_value2 = (Button)view.findViewById(R.id.btn_band4_value2);
        btn_multiplier = (Button)view.findViewById(R.id.btn_band4_multiplier);
        btn_tolerance = (Button)view.findViewById(R.id.btn_band4_tolerance);

        loadViewParameter(imageView, textView, getActivity(), 4);

        btn_value1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                putResult(4, 2);
            }
        });

        btn_value2.setOnClickListener(new View.OnClickListener(){
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

        return view;
    }
}
