package com.example.gridview1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    Context context;
    int[] img;

    public ImageAdapter(Context context, int[] img) {
        this.context = context;
        this.img = img;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView iv;
        if(view==null){
            iv= new ImageView(context);
            iv.setLayoutParams(new ViewGroup.LayoutParams(200,200));
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        else{
            iv=(ImageView) view;
        }
        iv.setImageResource(img[i]);
        return iv;
    }
}
