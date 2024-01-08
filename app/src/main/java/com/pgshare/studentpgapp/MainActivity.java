package com.pgshare.studentpgapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Pg(View view) {
        Intent intent=new Intent(MainActivity.this, Add_Room.class);
        startActivity(intent);
    }

    public void Owner(View view) {
        Intent intent=new Intent(MainActivity.this, Login.class);
        startActivity(intent);
    }

    public void Rent(View view) {
        Intent intent=new Intent(MainActivity.this, home_page.class);
        startActivity(intent);
    }




}