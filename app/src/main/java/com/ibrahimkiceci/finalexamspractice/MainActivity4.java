package com.ibrahimkiceci.finalexamspractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class MainActivity4 extends AppCompatActivity {

    //Date Activity
    DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        datePicker = findViewById(R.id.date_picker);

    }

    public void save(View view){

        String dateSelected = datePicker.getYear() + " " + datePicker.getMonth() + " " + datePicker.getDayOfMonth();

        Intent intent = new Intent(MainActivity4.this, MainActivity3.class);

        intent.putExtra("dateInput", dateSelected);
        startActivity(intent);


    }
}