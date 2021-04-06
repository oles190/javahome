package com.company.Lesson15.Practice;

import java.lang.reflect.Field;

public class Person {

    private String name;
    private Integer age;
    private String  surname;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.age = age;
        this.surname = surname;


    }
    public Person (){

    }




    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getName() + " "+ " "+ getAge();
    }

    public String getSurname() {
        return surname;
    }



}

