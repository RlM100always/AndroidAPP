package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity  {


    private ListView listView;
    private String[] countryNames = {"Bangladesh", "India", "Nepal", "USA"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countryNames);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCountry = countryNames[position];
                Toast.makeText(MainActivity.this, "Selected country: " + selectedCountry, Toast.LENGTH_SHORT).show();
            }
        });








    }
}