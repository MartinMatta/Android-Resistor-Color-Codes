package com.example.resistorcalculator;

import android.graphics.Color;
import android.widget.ImageView;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import petrov.kristiyan.colorpicker.ColorPicker;

public class Resistor extends Fragment {

    ImageView imageView;
    TextView textView;

    public void loadView(ImageView _imageView, TextView _textView) {
        imageView = _imageView;
        textView = _textView;
    }


    public void draw() { //ImageView imageView, int band
        textView.setText("otvory sa dialog a vybere sa farba");
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

    public int[] hexToRgb(int colorCode) {
        int[] color = {225, 12, 54};
        return color;
    }


}
