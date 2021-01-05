package com.example.resistorcalculator;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import petrov.kristiyan.colorpicker.ColorPicker;

public class Resistor extends Fragment {

    ImageView imageView;
    TextView textView;
    FragmentActivity fa;
    int bandCount;

    public void loadViewParameter(ImageView _imageView,
                                  TextView _textView,
                                  FragmentActivity _fa,
                                  int _bandCount) {
        imageView = _imageView;
        textView = _textView;
        fa = _fa;
        bandCount = _bandCount;
    }

    @SuppressLint("SetTextI18n")
    public void putResult(int value,
                          int tolerance,
                          int coefficient) {

            textView.setText(
                    value + "Ω  " + "±" + tolerance + "% " + coefficient + " ppm/°C"
            );
    }

    @SuppressLint("SetTextI18n")
    public void putResult(int value, int tolerance) {
        textView.setText(value + "Ω  " + "±" + tolerance + "%");
    }

    public void draw() { //ImageView imageView, int band
        //textView.setText("zobzari sa vysledok");
    }

    public int choseColor(int band) {
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

    public void refreshResistor(int band) {
        choseColor(band); //vybrat farbu
        draw(); //nakreslit zmenu na obrazok a vypisat vysledok
    }


}
