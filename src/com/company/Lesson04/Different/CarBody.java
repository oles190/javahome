package com.company.Lesson04.Different;

public class CarBody {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public CarBody(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "Car color is " + color + ".";
    }
    public void changeColor(String newColor){
        this.color=newColor;
    }
}
