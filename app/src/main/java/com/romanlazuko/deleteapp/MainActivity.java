package com.romanlazuko.deleteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.print("Log");
        setContentView(R.layout.activity_main);
        System.out.print("Activity was");
    }
}