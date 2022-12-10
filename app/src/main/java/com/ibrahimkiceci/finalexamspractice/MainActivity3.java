package com.ibrahimkiceci.finalexamspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView =findViewById(R.id.showText);
        textView2 = findViewById(R.id.showDateText);

        Intent intent = getIntent();
        String my_time  = intent.getStringExtra("timeInput");
        textView.setText("Time: " + my_time);
        String my_date = intent.getStringExtra("dateInput");
        textView2.setText("Date: " + my_date);



    }
}