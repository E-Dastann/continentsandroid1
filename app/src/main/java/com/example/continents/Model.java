package com.example.continents;

import android.widget.ImageView;
import android.widget.TextView;

public class Model {
    private int imageView;
    private String textView;


    public Model(int imageView, String textView) {
        this.imageView = imageView;
        this.textView = textView;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}
