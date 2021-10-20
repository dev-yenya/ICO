package com.cookandroid.ico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        Intent intent=getIntent();



        Intent intent_call=new Intent(Location.this, StoreList.class);
        startActivity(intent_call);
    }
}