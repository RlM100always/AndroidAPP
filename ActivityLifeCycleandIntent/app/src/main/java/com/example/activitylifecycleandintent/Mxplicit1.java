package com.example.activitylifecycleandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Mxplicit1 extends AppCompatActivity {

    Button bt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mxplicit1);
        bt=findViewById(R.id.bt);


    }
}