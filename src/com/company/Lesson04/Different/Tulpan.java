package com.company.Lesson04.Different;

public class Tulpan extends  Flower{

    public Tulpan(String color, int price) {
        super(color, price);
    }
    @Override
    public void smells(){
        System.out.println("Smells good!");
    }

}
