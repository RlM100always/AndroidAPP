package com.example.activitylifecycleandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Explicit2 extends AppCompatActivity {
   Button bt ;
   TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit2);

        bt=findViewById(R.id.bt);
        tv=findViewById(R.id.tv);




        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Explicit1 obj= new Explicit1();
                obj.cnt=1;
                Intent intent = new Intent(Explicit2.this,Explicit1.class);
                intent.putExtra("key1","I am coming from Second Activity ");
                startActivity(intent);

            }
        });

        show();
    }
    public  void show(){
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String str1=bundle.getString("key");

            tv.setText(str1);
        }
    }
}