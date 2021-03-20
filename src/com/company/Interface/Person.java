package com.company.Interface;

public class Person implements Start {
    public String name;
    public String eats;

    @Override
    public void say() {
        System.out.println("I am a "+ name +""+ eats );
    }
    public Person(String name, String eats){
        this.name=name;
        this.eats=eats;
    }


    @Override
    public void eat() {
        System.out.println("GOOOOD");
    }



}
//