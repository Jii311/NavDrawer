package com.example.navdrawer;

public class ModelPenyanyi {
    String textName;
    int imageView;

    public ModelPenyanyi(String name, int image) {
        this.textName = name;
        this.imageView = image;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}
