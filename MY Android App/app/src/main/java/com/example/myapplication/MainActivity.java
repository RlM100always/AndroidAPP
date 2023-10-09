package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9 ;
    String bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
    int count = 0 ;
    int flag=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionButton();


    }

    public void actionButton(){
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button7=findViewById(R.id.button7);
        button8=findViewById(R.id.button8);
        button9=findViewById(R.id.button9);
    }

    public void showText(View view){
        Button button = (Button) view;
        String nullCheck;
        nullCheck=button.getText().toString();

        if(nullCheck.equals("")){
            if(flag==0){
                button.setText("x");
                count++ ;
                flag=1 ;
            }else if(flag==1){
                button.setText("o");
                count++ ;
                flag=0;
            }

            if(count>4){
                bt1=button1.getText().toString();
                bt2=button2.getText().toString();
                bt3=button3.getText().toString();
                bt4=button4.getText().toString();
                bt5=button5.getText().toString();
                bt6=button6.getText().toString();
                bt7=button7.getText().toString();
                bt8=button8.getText().toString();
                bt9=button9.getText().toString();

                if(bt1.equals(bt2) && bt2.equals(bt3)  && !bt1.equals("")){


                   // Toast.makeText(this,"Winner "+bt1,Toast.LENGTH_SHORT).show();
                    customToast(bt1);
                    restart();
                }
                if(bt4.equals(bt5) && bt5.equals(bt6)  && !bt5.equals("")){
                    customToast(bt4);
                    //Toast.makeText(this,"Winner "+bt5,Toast.LENGTH_SHORT).show();
                    restart();
                }
                if(bt7.equals(bt8) && bt8.equals(bt9)  && !bt7.equals("")){
                    customToast(bt7);
                   // Toast.makeText(this,"Winner "+bt7,Toast.LENGTH_SHORT).show();
                    restart();
                }
                if(bt1.equals(bt4) && bt4.equals(bt7)  && !bt1.equals("")){
                    customToast(bt4);
                    //Toast.makeText(this,"Winner "+bt1,Toast.LENGTH_SHORT).show();
                    restart();
                }
                if(bt2.equals(bt5) && bt5.equals(bt8)  && !bt2.equals("")){
                    customToast(bt2);
                    //Toast.makeText(this,"Winner "+bt2,Toast.LENGTH_SHORT).show();
                    restart();
                }
                if(bt3.equals(bt6) && bt6.equals(bt9)  && !bt3.equals("")){
                    customToast(bt3);
                    //Toast.makeText(this,"Winner "+bt3,Toast.LENGTH_SHORT).show();
                    restart();
                }
                if(bt1.equals(bt5) && bt5.equals(bt9)  && !bt1.equals("")){
                    customToast(bt1);
                    //Toast.makeText(this,"Winner "+bt1,Toast.LENGTH_SHORT).show();
                    restart();
                }
                if(bt3.equals(bt5) && bt5.equals(bt7)  && !bt3.equals("")){
                    customToast(bt3);
                   // Toast.makeText(this,"Winner "+bt3,Toast.LENGTH_SHORT).show();
                    restart();
                }

            }

            if(count>=9){
                customToast("Match is Drawn");
                //Toast.makeText(this,"Match is Drawan ",Toast.LENGTH_SHORT).show();
                restart();

            }

        }


    }

    public void customToast(String xory){
        LayoutInflater inflater=getLayoutInflater();
        View customviewLayout= inflater.inflate(R.layout.custom_toast,findViewById(R.id.customtoast));

        ImageView toastImage = customviewLayout.findViewById(R.id.toast_image);
        toastImage.setImageResource(R.drawable.tci);

        TextView tv=customviewLayout.findViewById(R.id.tv);
        if(xory.equals("Match is Drawn")){
            tv.setText(xory);
        }else{
            tv.setText("Winner "+xory);
        }

        Toast obj = new Toast(this);
        obj.setDuration(Toast.LENGTH_LONG);
        obj.setView(customviewLayout);
        obj.setGravity(Gravity.CENTER_VERTICAL,0,0);
        obj.show();
    }

    public void restart(){
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        count=0;
        flag=0;

    }
}