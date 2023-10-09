package com.example.buttonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn ;
    private TextView txtview ;
    int count=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.id_button);
        txtview=findViewById(R.id.id_textview);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++ ;
                txtview.setText("Upper button is clicked "+count+" times ");
            }
        });
    }
}