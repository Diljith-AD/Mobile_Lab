package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner sp;
    TextView t1;
    String s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner) findViewById(R.id.sp);
        t1=(TextView) findViewById(R.id.t1) ;
        List<String> items=new ArrayList<>();
        items.add("IPhone");
        items.add("Samsung");
        items.add("Pixel");
        items.add("Realme");
        items.add("Vivo");
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sp.setAdapter(adapter);
            sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    s1=sp.getSelectedItem().toString();
                    t1.setText("Selected Item: "+s1);
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {
                    t1.setText("Select  Item");
                }
            });


    }
}