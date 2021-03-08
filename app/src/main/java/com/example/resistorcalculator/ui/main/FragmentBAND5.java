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

public class FragmentBAND5 extends Resistor {

    Button btn_value1;
    Button btn_value2;
    Button btn_value3;
    Button btn_multiplier;
    Button btn_tolerance;

    ImageView imageView;
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.band5_layout, container, false);

        textView = (TextView)view.findViewById(R.id.textView2);

        btn_value1 = (Button)view.findViewById(R.id.btn_band5_value1);
        btn_value2 = (Button)view.findViewById(R.id.btn_band5_value2);
        btn_value3 = (Button)view.findViewById(R.id.btn_band5_value3);
        btn_multiplier = (Button)view.findViewById(R.id.btn_band5_multiplier);
        btn_tolerance = (Button)view.findViewById(R.id.btn_band5_tolerance);

        loadViewParameter(imageView, textView, getActivity(), 5);

        btn_value1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                putResult(5, 5f);
                choseColor(1, btn_value1);
            }
        });

        btn_value2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(2, btn_value2);
            }
        });

        btn_value3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(3, btn_value3);
            }
        });

        btn_multiplier.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(4, btn_multiplier);
            }
        });

        btn_tolerance.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choseColor(5, btn_tolerance);
            }
        });


        return view;
    }
}
