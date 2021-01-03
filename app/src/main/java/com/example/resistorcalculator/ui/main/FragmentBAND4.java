package com.example.resistorcalculator.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import com.example.resistorcalculator.Resistor;
import com.example.resistorcalculator.R;

import org.xdty.preference.colorpicker.ColorPickerDialog;
import org.xdty.preference.colorpicker.ColorPickerSwatch;

public class FragmentBAND4 extends Fragment {

    ListView list;
    TextView result;
    ImageView imageView;

    private int mSelectedColor;

    private static String[] BAND = {
            "value 1","value 2",
            "multiplier","tolerance"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.band4_layout, container, false);

        imageView = (ImageView) view.findViewById(R.id.resistorBAND4);

        mSelectedColor = ContextCompat.getColor(getContext(), R.color.flamingo);
        int[] mColors = getResources().getIntArray(R.array.default_rainbow);

        ColorPickerDialog dialog = ColorPickerDialog.newInstance(R.string.color_picker_default_title,
                mColors,
                mSelectedColor,
                5, // Number of columns
                ColorPickerDialog.SIZE_SMALL,
                true
        );

        dialog.setOnColorSelectedListener(new ColorPickerSwatch.OnColorSelectedListener() {

            @Override
            public void onColorSelected(int color) {
                mSelectedColor = color;
                Toast.makeText(getContext(), mSelectedColor, Toast.LENGTH_SHORT);
            }

        });

        return view;
    }
}
