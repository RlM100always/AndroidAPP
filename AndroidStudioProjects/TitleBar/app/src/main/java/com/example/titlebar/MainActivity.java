package com.example.titlebar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1,editText2;
    Button button1,button2,button3,button4  ;
    TextView ed3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        editText1=(EditText) findViewById(R.id.et1);
        ed3 = (TextView) findViewById(R.id.tv1);
        editText2=(EditText) findViewById(R.id.et2);
        button1=(Button) findViewById(R.id.bt1);
        button2=(Button) findViewById(R.id.bt2);
        button3=(Button) findViewById(R.id.bt3);
        button4=(Button) findViewById(R.id.bt4);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(String.valueOf(editText1.getText()));
                double b = Double.parseDouble(editText2.getText().toString());
                double ans = a+b ;
                String s = String.valueOf(ans);
                ed3.setText(s);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Double.parseDouble(String.valueOf(editText1.getText()));
                double b = Double.parseDouble(editText2.getText().toString());
                double ans = a-b ;
                String s = String.valueOf(ans);
                ed3.setText(s);

            }
        });




    }
}