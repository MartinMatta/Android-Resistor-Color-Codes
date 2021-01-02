package com.example.resistorcalculator.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.resistorcalculator.R;

public class FragmentBAND5 extends Fragment {

    ListView list;
    private static String[] BAND = {"value 1","value 2","value 3","multiplier", "tolerance"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.band5_layout, container, false);

        //list = (ListView)view.findViewById(R.id.listView5);
        //list.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, BAND));

        return view;
    }
}
