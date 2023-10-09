package com.example.activitylifecycleandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Explicit1 extends AppCompatActivity {

    private Button bt ;
    public int cnt =1 ;
    TextView tv;
    private EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit1);

        bt= findViewById(R.id.bt);
        ed=findViewById(R.id.ed);
        tv=findViewById(R.id.tv);



        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //count=1;
                String passText=ed.getText().toString();
                Intent intent = new Intent("com.abc.BMI");
                //intent.putExtra("key",passText);
                startActivity(intent);

            }
        });


    }

//    public  void show(){
//
//        Bundle bundle = getIntent().getExtras();
//        if(bundle != null){
//            String str1=bundle.getString("key1");
//
//            tv.setText(str1);
//        }
//    }
}