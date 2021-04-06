package com.company.Serialization;

import java.io.Serializable;

public class Person implements Serializable {

        private String name;
        private int id;
        private transient  int salary;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name, int age, int salary) {
            this.name = name;
            this.id = id;
            this.salary=salary;
        }

    public Person() {
    }

    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return id;
        }

        public void setAge(int age) {
            this.id = age;
        }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    public  void say(){
            System.out.println("dssd");
        }
    }



