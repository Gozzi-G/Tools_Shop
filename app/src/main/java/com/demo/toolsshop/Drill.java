package com.demo.toolsshop;

import androidx.annotation.NonNull;

public class Drill {
    private String title;
    private String info;
    private int imageResourceId;

    public Drill(String title, String info, int imageResourceId) {
        this.title = title;
        this.info = info;
        this.imageResourceId = imageResourceId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    //преопределяем метод toString в зависимости от того что мы хотим ввидеть на активности Дрелей
    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
