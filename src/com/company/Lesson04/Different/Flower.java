package com.company.Lesson04.Different;

public abstract class Flower {
    private String color;
    private  int price;

    public abstract void smells();


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    Flower(String color, int price){
        this.color=color;
        this.price= price;



    }

}
