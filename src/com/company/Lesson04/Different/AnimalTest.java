package com.company.Lesson04.Different;

import com.company.Lesson04.Different.Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Animal("Nensy",15,"Original");
        System.out.println("Name is "+ cat.getName()+ ",speed is  "+cat.getSpeed()+ " and type is "+cat.getType());
        cat.setName("Boruslav");
        cat.setSpeed(100);
        System.out.println("Name is "+ cat.getName()+ ",speed is  "+cat.getSpeed()+ " and type is "+cat.getType());

    }
}
