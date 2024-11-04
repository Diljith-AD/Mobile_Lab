package com.example.gcalc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView Result;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonplus, buttonminus, buttondiv, buttonmulti, buttonres, clear;

    private String input = "";
    private String operation = "";
    private double firstValue = 0;
    private boolean isNewOp = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result = findViewById(R.id.Result);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonplus = findViewById(R.id.buttonplus);
        buttonminus = findViewById(R.id.buttonminus);
        buttonmulti = findViewById(R.id.buttonmulti);
        buttondiv = findViewById(R.id.buttondiv);
        buttonres = findViewById(R.id.buttonres);
        clear = findViewById(R.id.clear);

        Buttonclick();
    }

    private void Buttonclick() {
        button0.setOnClickListener(v -> TakeInput("0"));
        button1.setOnClickListener(v -> TakeInput("1"));
        button2.setOnClickListener(v -> TakeInput("2"));
        button3.setOnClickListener(v -> TakeInput("3"));
        button4.setOnClickListener(v -> TakeInput("4"));
        button5.setOnClickListener(v -> TakeInput("5"));
        button6.setOnClickListener(v -> TakeInput("6"));
        button7.setOnClickListener(v -> TakeInput("7"));
        button8.setOnClickListener(v -> TakeInput("8"));
        button9.setOnClickListener(v -> TakeInput("9"));

        buttonplus.setOnClickListener(view -> Operation("+"));
        buttonminus.setOnClickListener(view -> Operation("-"));
        buttonmulti.setOnClickListener(view -> Operation("*"));
        buttondiv.setOnClickListener(view -> Operation("/"));
        buttonres.setOnClickListener(view -> Calculate());
        clear.setOnClickListener(v -> ClearInput());
    }

    private void TakeInput(String value) {
        if (isNewOp) {
            input = "";
            isNewOp = false;
        }
        input += value;
        Result.setText(getDisplayString());
    }

    private void Operation(String op) {
        if (!input.isEmpty()) {
            firstValue = Double.parseDouble(input);
            operation = op;
            input = "";
            Result.setText(getDisplayString());
            isNewOp = true;
        }
    }

    private void Calculate() {
        if (!input.isEmpty() && !operation.isEmpty()) {
            double secondValue = Double.parseDouble(input);
            double result = 0;

            switch (operation) {
                case "+":
                    result = firstValue + secondValue;
                    break;
                case "-":
                    result = firstValue - secondValue;
                    break;
                case "*":
                    result = firstValue * secondValue;
                    break;
                case "/":
                    if (secondValue != 0) {
                        result = firstValue / secondValue;
                    } else {
                        Result.setText("Error");
                        return;
                    }
                    break;
            }

            Result.setText(firstValue + " " + operation + " " + secondValue + " = " + result);
            input = "";
            isNewOp = true;
            operation = "";
        }
    }

    private String getDisplayString() {

        String display = "";
        if (!input.isEmpty()) {
            display += input;
        }
        if (!operation.isEmpty()) {
            display += " " + operation;
        }
        return display;
    }

    private void ClearInput() {
        input = "";
        operation = "";
        firstValue = 0;
        isNewOp = true;
        Result.setText("0");
    }
}
