package com.company.Interfacce;

public class HoursSalary implements Employee {
private int hours;
private int hoursSalaru;

    public HoursSalary(int hoursSalaru,int hours) {

        this.hoursSalaru=hoursSalaru;
        this.hours=hours;

    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getHoursSalaru() {
        return hoursSalaru;
    }

    public void setHoursSalaru(int hoursSalaru) {
        this.hoursSalaru = hoursSalaru;
    }

    @Override
    public double calcSalary() {
        return hours*hoursSalaru;
    }
}
