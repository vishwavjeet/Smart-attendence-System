package com.example.sih_facedetection;



import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import android.os.Bundle;

import java.util.Calendar;

public class MainActivity3 extends AppCompatActivity {
    Button Buttton5;
    Button Buttton2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Buttton5=(Button)findViewById(R.id.button5);
        Buttton2=(Button)findViewById(R.id.button2);
        Buttton5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        Buttton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i= new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(i);
            }
        });
    }
}
