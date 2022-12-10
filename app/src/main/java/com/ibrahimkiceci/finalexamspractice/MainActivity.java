package com.ibrahimkiceci.finalexamspractice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.net.Inet4Address;
import java.sql.Time;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    NavigationView navigationView;

    //


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open,R.string.nav_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true;

        }


        return super.onOptionsItemSelected(item);

    }

    // Navigation Drawerindaki itemlarin tiklanabilir olabilmesi icin sunlari yapman gerekir. Oncelikle classina sunu ekliyorsun
    //1. implements NavigationView.OnNavigationItemSelectedListener
    //2. Main activitydeki layout'unda navigationview var orda ona id ver, ardindan on create ine su kodlari yaz;
    // navigationView = findViewById(R.id.nav_view);
    //navigationView.setNavigationItemSelectedListener(this);
    //3. Daha sonra zaten implement edince methodlari ekle dite cikiyor onNavigationItemSelected oraya getId'ne gore kodlari yaz


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.timePicker){
            Intent intent =  new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            Toast.makeText(this, "Tiklandi", Toast.LENGTH_SHORT).show();
        }

       return true;
    }

}