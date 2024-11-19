package com.example.gridcalc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView inp,result;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Button plus,minus,div,multi,clear,equalto;
    private static final char Addition='+';
    private static final char Subtraction='-';
    private static final char Multiplication='*';
    private static final char Division='/';

    private char currentop;
    private double firstvalue;
    private double secondvalue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        inp=findViewById(R.id.inp);
        result=findViewById(R.id.result);

        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);

        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        div=findViewById(R.id.div);
        multi=findViewById(R.id.multi);
        clear=findViewById(R.id.clear);
        equalto=findViewById(R.id.equalto);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inp.append("0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstvalue=Double.parseDouble(inp.getText().toString());
                currentop=Addition;
                result.setText(firstvalue+"+");
                inp.setText(null);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstvalue=Double.parseDouble(inp.getText().toString());
                currentop=Subtraction;
                result.setText(firstvalue+"-");
                inp.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstvalue=Double.parseDouble(inp.getText().toString());
                currentop=Division;
                result.setText(firstvalue+"/");
                inp.setText(null);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstvalue=Double.parseDouble(inp.getText().toString());
                currentop=Multiplication;
                result.setText(firstvalue+"*");
                inp.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            firstvalue=Double.NaN;
            secondvalue=Double.NaN;
            inp.setText(null);
            result.setText(null);
            }
        });

        equalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AllCalculation();
                result.setText(String.valueOf(firstvalue));
                firstvalue=Double.NaN;
                currentop='\0';
            }
        });


    }
    private void AllCalculation(){
        if(!Double.isNaN(firstvalue)){
            secondvalue=Double.parseDouble(inp.getText().toString());
            inp.setText(null);
            if(currentop==Addition){
                firstvalue=this.firstvalue+secondvalue;
            }
            else if (currentop==Subtraction) {
                firstvalue=this.firstvalue-secondvalue;
            }
            else if (currentop==Multiplication) {
                firstvalue=this.firstvalue*secondvalue;
            }
            else if (currentop==Division) {
                firstvalue=this.firstvalue/secondvalue;
            }
            else {
                try {
                    firstvalue=Double.parseDouble(inp.getText().toString());
                } catch (Exception e) {
                }
            }
        }
    }
}
