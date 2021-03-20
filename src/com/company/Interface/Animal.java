package com.company.Interface;

public class Animal  implements Start  {
    @Override
    public void eat() {
        System.out.println("Tasty ");
    }

    @Override
    public void say() {
        System.out.println("Hello!");
    }
}
   //