package com.example.activitylifecycleandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class AleartDialogue extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleart_dialogue);

        button=findViewById(R.id.button1);
        button.setBackgroundColor(Color.RED);
    }
}