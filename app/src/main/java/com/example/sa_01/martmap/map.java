package com.example.sa_01.martmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class map extends AppCompatActivity {

    BitmapImageView vm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_map);

        Button btn1 = (Button)findViewById(R.id.길찾기);
    }
}

