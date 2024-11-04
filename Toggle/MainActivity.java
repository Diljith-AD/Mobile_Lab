package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.CompoundButton;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
        ImageView Iview;
        ToggleButton Tog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Iview=findViewById(R.id.imageView);
        Tog=findViewById(R.id.toggleButton);

        Tog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Tog.isChecked()){
                    Iview.setImageResource(R.drawable.untitled);
                }else {
                    Iview.setImageResource(R.drawable.im_cloth_001);
                }
            }
        });
    }
}