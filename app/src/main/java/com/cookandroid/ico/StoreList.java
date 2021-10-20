package com.cookandroid.ico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StoreList extends AppCompatActivity {

    private ListView list;
    private String select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_list);

        Intent intent=getIntent();
        Integer option=intent.getIntExtra("option",-1);

        list=(ListView) findViewById(R.id.list);

        List<String> data=new ArrayList<>();

        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("와우신내떡");
        data.add("숙명여자대학교");
        data.add("3킬로미터");

        //adapter.notifyDataSetChanged();

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                String str=(String) adapterView.getItemAtPosition(position);
                select=str;

                if(option==0) {
                    Intent intent2 = new Intent(StoreList.this, Call.class);
                    intent2.putExtra("select", select);
                    startActivity(intent2);
                }
                else if(option==1) {
                    Intent intent2 = new Intent(StoreList.this, Order.class);
                    intent2.putExtra("select", select);
                    startActivity(intent2);
                }
            }
        });



    }
}