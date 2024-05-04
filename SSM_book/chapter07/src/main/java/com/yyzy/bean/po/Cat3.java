package com.yyzy.bean.po;

public class Cat3 {
    private String color;

    public Cat3() {
    }

    public Cat3(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat3{" +
                "color='" + color + '\'' +
                '}';
    }
}
