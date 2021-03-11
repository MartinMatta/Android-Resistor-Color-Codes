package com.example.resistorcalculator;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import java.util.ArrayList;

import petrov.kristiyan.colorpicker.ColorPicker;

public class Resistor extends Fragment {

    Colors c = new Colors();

    float tolerance = 10f;

    ImageView imageView;
    TextView textView;
    FragmentActivity fa;
    int bandCount;

    private String[] value = {"", "", ""};


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
                          float tolerance,
                          int coefficient) {

            textView.setText(
                    value + "Ω  " + "±" + tolerance + "% " + coefficient + " ppm/°C"
            );
    }

    @SuppressLint("SetTextI18n")
    public void putResult(int value, float tolerance) {
        textView.setText(value + "Ω  " + "±" + tolerance + "%");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private int joinNumber(String[] num) {

        int value;

        if (bandCount != 4) {
            value = Integer.parseInt(
                    String.join("", num[0], num[1], num[2])
            );
        } else {
            value = Integer.parseInt(
                    String.join("", num[0], num[1])
            );
        }
        return value;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private int makeNumber(String[] num) {
        int value = 0;

        if (num[0] == "0") {//||
            value = 0;
        } else {
            value = joinNumber(num);
        }
        return value;
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private void setButtonText(Button button, int band, int position) {
        String text;
        int coef = 0;

        switch (band) {
            case 1:
                text = Colors.valueColorNames[position];
                value[0] = String.valueOf(position);
                break;
            case 2:
                text = Colors.valueColorNames[position];
                value[1] = String.valueOf(position);
                break;
            case 3:
                text = Colors.valueColorNames[position];
                value[2] = String.valueOf(position);
                break;
            case 4:
                text = Colors.multiplierColorNames[position];
                break;
            case 5:
                text = Colors.toleranceColorNames[position];
                tolerance = Colors.toleranceBANDValue[position];
                break;
            case 6:
                text = Colors.coefficientColorNames[position];
                coef = Colors.coefficientBANDValue[position];
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + band);
        }
        button.setText(text);

        putResult(makeNumber(value), tolerance);
    }


    public void draw() { //ImageView imageView, int band
        //textView.setText("zobzari sa vysledok");
    }

    protected ArrayList<String> loadColor(int[] _colors) {
        ArrayList<String> colors = new ArrayList<>();

        for (int i = 0; i < _colors.length; i++) {
            colors.add(String.format("#%06X", _colors[i]));
        }

        return colors;
    }

    public int choseColor(int band, Button button, View view) {
        int[] _color = {0};

        ColorPicker colorPicker = new ColorPicker(fa);

        colorPicker.setTitle(getString(
                R.string.color_picker_title
        ));


        switch (band) {
            case 1:
                colorPicker.setColors(loadColor(Colors.valueBANDColor));
                break;
            case 2:
                colorPicker.setColors(loadColor(Colors.valueBANDColor));
                break;
            case 3:
                colorPicker.setColors(loadColor(Colors.valueBANDColor));
                break;
            case 4:
                colorPicker.setColors(loadColor(Colors.multiplierBANDColor));
                break;
            case 5:
                colorPicker.setColors(loadColor(Colors.toleranceBANDColor));
                break;
            case 6:
                colorPicker.setColors(loadColor(Colors.coefficientBANDColor));
                break;

        }

        colorPicker.setOnFastChooseColorListener(new ColorPicker.OnFastChooseColorListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void setOnFastChooseColorListener(int position, int color) {
                _color[0] = position;
                view.setBackgroundColor(color);

                setButtonText(button, band, position);
            }

            @Override
            public void onCancel() {

            }
        }).show();

        return _color[0];
    }

    public void refreshResistor(int band) {
    }


}
