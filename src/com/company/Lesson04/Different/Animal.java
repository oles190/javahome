package com.company.Lesson04.Different;

public class Animal {

    private String name;
    private int speed;
    private String type;

    Animal(String name,int speed,String type){
        this.name=name;
        this.speed=speed;
        this.type=type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
