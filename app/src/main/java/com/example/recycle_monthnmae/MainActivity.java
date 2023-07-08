package com.example.recycle_monthnmae;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyClerAdapter adapter;
    String monthName[] = {"winter ","autumn ", "spring","January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     recyclerView = findViewById(R.id.recyclerview);
     recyclerView.setLayoutManager(new LinearLayoutManager(this));
         adapter =  new RecyClerAdapter(this,monthName);
         recyclerView.setAdapter(adapter);




    }
}