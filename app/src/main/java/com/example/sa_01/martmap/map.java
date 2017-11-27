package com.example.sa_01.martmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class map extends AppCompatActivity {

    BitmapImageView vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vm = new BitmapImageView(this);

        setContentView(vm);
    }
}

