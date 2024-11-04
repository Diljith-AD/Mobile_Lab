package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.GridView;

import com.example.gridviewimage.ImageAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gd;
    int[] img={R.drawable.one1,R.drawable.p0ixel,R.drawable.images};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gd=(GridView) findViewById(R.id.gd);
        gd.setAdapter(new ImageAdapter(this,img));

        gd.setOnItemClickListener((parent,view,position,id)->
                new AlertDialog.Builder(this)
                        .setTitle("Selected Image")
                        .setMessage("You have Selected this Image "+(position+1))
                        .setPositiveButton("OK",(dialog,which)->dialog.dismiss())
                        .create()
                        .show());
    }
}