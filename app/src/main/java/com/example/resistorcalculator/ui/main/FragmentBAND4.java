package com.example.resistorcalculator.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.resistorcalculator.R;
import com.example.resistorcalculator.Resistor;

public class FragmentBAND4 extends Fragment {

    ListView list;
    TextView result;
    ImageView imageView;

    private static String[] BAND = {
            "value 1","value 2",
            "multiplier","tolerance"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.band4_layout, container, false);

        imageView = (ImageView) view.findViewById(R.id.resistorBAND4);
        //list.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, BAND));

        Resistor resistor = new Resistor();
        resistor.drawBand(imageView, 1, 0x01);

        return view;
    }
}
