package com.company.Lesson04.Different;

public class Rose extends  Flower{

    public Rose(String color, int price) {
        super(color, price);
    }
    @Override
    public void smells(){
        System.out.println("Smells good!");
    }


}
