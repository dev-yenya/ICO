package com.cookandroid.ico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Call extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        text=findViewById(R.id.store_name);

        Intent intent=getIntent();
        String str=intent.getStringExtra("select");
        text.setText(str);  //가게 이름 나타나도록
    }
}