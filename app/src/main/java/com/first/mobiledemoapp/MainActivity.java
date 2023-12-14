package com.first.mobiledemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create and set the adapter with coffee data
        CoffeeAdapter coffeeAdapter = new CoffeeAdapter(/* pass your data here */);
        recyclerView.setAdapter(coffeeAdapter);
        
    }
}
