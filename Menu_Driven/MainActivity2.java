package com.example.menu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText amt,time,rate,res,total;
    Button enter1;

    int amt11,time11,rate11,res11,total11;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        amt=(EditText)findViewById(R.id.pamt1);
        time=(EditText)findViewById(R.id.time1);
        rate=(EditText)findViewById(R.id.rate1);
        res=(EditText)findViewById(R.id.res1);
        total=(EditText)findViewById(R.id.total);

        enter1=(Button)findViewById(R.id.enter1);

        enter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = amt.getText().toString();
                String s2 = time.getText().toString();
                String s3 = rate.getText().toString();



                amt11=Integer.parseInt(s1);
                time11=Integer.parseInt(s2);
                rate11=Integer.parseInt(s3);
                res11=(amt11*time11*rate11)/100;

                res.setText(String.valueOf(res11));
                total11=res11+amt11;

                total.setText(String.valueOf(total11));





            }
        });
    }
}