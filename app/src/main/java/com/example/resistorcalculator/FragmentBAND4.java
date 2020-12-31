package com.example.resistorcalculator;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ListView;

import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FragmentBAND4 extends Fragment {

    ListView list;
    private static String[] BAND = {
            "value 1","value 2",
            "multiplier","tolerance"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.band4_layout, container, false);

        //list = (ListView)view.findViewById(R.id.listView4);
        //list.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, BAND));

        return view;
    }
}
