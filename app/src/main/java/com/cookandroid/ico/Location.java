package com.cookandroid.ico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        Intent intent=getIntent();
        Integer option=intent.getIntExtra("option",-1);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {   //2초 뒤에 가게 리스트 보여줌
            @Override
            public void run() {
                Intent intent2=new Intent(Location.this, StoreList.class);
                intent2.putExtra("option", option); //안심콜인지 주문인지 구분
                startActivity(intent2);
            }
        }, 2000);

    }
}