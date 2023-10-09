package com.example.activitylifecycleandintent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Intentgo extends AppCompatActivity {
    Button but,but1,but2,but3;
    EditText ed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentgo);
        connectXmlWithJava();

    }

    public void connectXmlWithJava(){
        but = findViewById(R.id.but);
        but1=findViewById(R.id.but1);
        but3 = findViewById(R.id.but3);
        ed=findViewById(R.id.ed);
    }

    public void openSomeThing(View view) {
        Button button = (Button) view;
       // EditText ed2=(EditText) view;
        String number = ed.getText().toString();
        String textbtn = button.getText().toString();

        if(textbtn.equals("SHARE")){
            Uri ob=Uri.parse("smsto:"+"01825008451");
            Intent dialnum=new Intent(Intent.ACTION_SENDTO,ob);
            dialnum.putExtra("body",number);
            startActivity(dialnum);
        }



//        switch (textbtn) {
//            case "GO TO YOUTUBE": {
//                String url = "https://www.youtube.com/";
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.instagram.com/"));
//                startActivity(intent);
//                break;
//            }
//            case "GO TO GOOGLE": {
//                String url = "https://www.google.com/";
//                Uri obj = Uri.parse(url);
//                Intent intent = new Intent(Intent.ACTION_VIEW, obj);
//                startActivity(intent);
//                break;
//            }
//            case "DIAL PHONE NUMBER": {
//
//
//                Intent callIntent = new Intent(Intent.ACTION_DIAL);
//                callIntent.setData(Uri.parse("tel:01825008451"));
//                startActivity(callIntent);
//
//                break;
//            }
   //     }

    }
}
