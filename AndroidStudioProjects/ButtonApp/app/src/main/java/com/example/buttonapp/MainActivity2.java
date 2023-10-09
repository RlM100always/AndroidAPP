package com.example.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button bt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt =(Button) findViewById(R.id.button1);

    }
    public  void backFromPage(View v)
    {
        Intent obj = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(obj);
    }


}