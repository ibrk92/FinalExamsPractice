package com.ibrahimkiceci.finalexamspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

public class MainActivity2 extends AppCompatActivity {

    //Time Activity
    TimePicker timePicker;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        timePicker = findViewById(R.id.timePicker);
        sharedPreferences = getSharedPreferences("timeDetails", MODE_PRIVATE);
    }

    public void save(View view){
        String time = timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute();

        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        intent.putExtra("timeInput", time);
        startActivity(intent);







    }
}