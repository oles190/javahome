package com.company.Lesson06;

public class Car {
    private int year;

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    private String model;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
