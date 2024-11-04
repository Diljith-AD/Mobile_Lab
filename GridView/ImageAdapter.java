package com.example.gridviewimage;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    Context mcontext;
    int img[];

    public ImageAdapter(android.content.Context context, int[] imageslist) {
        mcontext = context;
        img = imageslist;
    }

    public int getCount() {
        return img.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, android.view.ViewGroup parent) {
        ImageView iv;
        if (convertView == null) {
            iv = new ImageView(mcontext);
            iv.setLayoutParams(new GridView.LayoutParams(200, 200));
            iv.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            iv = (ImageView) convertView;
        }
        iv.setImageResource(img[position]);
        return iv;
    }
}
