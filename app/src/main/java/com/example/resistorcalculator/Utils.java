package com.example.resistorcalculator;

import android.content.Context;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.FragmentActivity;

import petrov.kristiyan.colorpicker.ColorPicker;
import androidx.fragment.app.Fragment;

public class Utils extends Fragment{

    int[] bandColor = {};

    public int[] hexToRgb(int colorCode) {
        int[] color = {225, 12, 54};
        return color;
    }

    public int choseColor(FragmentActivity fa, int band) {
        int[] _color = {0};

        new ColorPicker(fa)
                .setOnFastChooseColorListener(new ColorPicker.OnFastChooseColorListener() {
                    @Override
                    public void setOnFastChooseColorListener(int position, int color) {
                        _color[0] = position;
                        //bandColor[band - 1] = position;
                    }

                    @Override
                    public void onCancel() {

                    }
                })
                .setTitle("Select color")
                .show();;


        return _color[0];
    }

    public int get() {
        return bandColor[0];
    }
}
