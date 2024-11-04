package com.example.menu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity {

    EditText amt,fre,time,rate,res,res2;
    Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        amt=(EditText) findViewById(R.id.amt2);
        fre=(EditText) findViewById(R.id.frequencyn2);
        time=(EditText) findViewById(R.id.time2);
        rate=(EditText) findViewById(R.id.rate2);
        res=(EditText) findViewById(R.id.res2);
        res2=(EditText)findViewById(R.id.res);
        enter=(Button) findViewById(R.id.enter2);


        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=amt.getText().toString();
                String s2=fre.getText().toString();
                String s3=time.getText().toString();
                String s4=rate.getText().toString();

                double amt12=Double.parseDouble(s1);
                double fre12=Double.parseDouble(s2);
                double time12=Double.parseDouble(s3);
                double rate12=Double.parseDouble(s4)/100;
                double amount = amt12 * Math.pow((1 + rate12 / fre12), fre12 * time12);
                double c1 = amount - amt12;

                double total=c1+amt12;

                res2.setText(String.valueOf(total));

                res.setText(String.valueOf(c1));
            }
        });

    }
}