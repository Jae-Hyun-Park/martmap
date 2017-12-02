package com.example.sa_01.martmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_map);

        Button btn1 = (Button)findViewById(R.id.길찾기);
        Button btn2 = (Button)findViewById(R.id.장바구니);
        Button btn3 = (Button)findViewById(R.id.물품재등록);

        btn1.setOnClickListener(t);
        btn2.setOnClickListener(t);
        btn3.setOnClickListener(t);
    }
    Button.OnClickListener t = new Button.OnClickListener(){
        public void onClick(View v) {
            Log.i("여기", "들어가냐");
            BitmapImageView biv = (BitmapImageView)findViewById(R.id.BI);
            Button btn = (Button)findViewById(v.getId());

            switch(v.getId()) {
                case R.id.길찾기:
                    Log.i("여기", "들어가냐2");
                    if(biv.buttonState == 0){
                        biv.buttonState = 1;
                        biv.invalidate();
                        break;
                    }else if(biv.buttonState == 1){
                        biv.buttonState = 0;
                        biv.invalidate();
                        break;
                    }

                case R.id.장바구니:
                    Log.i("여기", "들어가냐3");
                    break;

                case R.id.물품재등록:
                    Log.i("여기", "들어가냐4");
                    break;
            }
        }
    };
}

