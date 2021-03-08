package com.example.resistorcalculator;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.resistorcalculator.ui.main.*;

public class MainActivity extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;

    final Context c = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);


        tabs.setupWithViewPager(viewPager);
    }


    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            LayoutInflater layoutInflaterAndroid = LayoutInflater.from(c);
            View mView = layoutInflaterAndroid.inflate(R.layout.exit_dialog, null);
            AlertDialog.Builder alertDialogBuilderUserInput = new AlertDialog.Builder(c);
            alertDialogBuilderUserInput.setView(mView);

            AlertDialog alertDialogAndroid = alertDialogBuilderUserInput.create();

            Button btnCancel = (Button) mView.findViewById(R.id.btnCancel);
            Button btnOk = (Button) mView.findViewById(R.id.btnOk);

            btnCancel.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    alertDialogAndroid.dismiss();
                }
            });

            btnOk.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    finish();
                    System.exit(1);
                }
            });

            alertDialogAndroid.show();

        }
        this.doubleBackToExitPressedOnce = true;



        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }


}