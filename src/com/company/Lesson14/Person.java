package com.company.Lesson14;

public class Person implements  Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public int compareTo(Person s) {
        if (age > s.getAge()) {
            return -1;
        } else if (age == s.getAge()) {
            return 0;
        }
        return 1;
    }
}