package com.company.Interfacce;

public class FixSalary implements Employee {
    private int salary;

    public FixSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public double calcSalary() {
        return salary;
    }


}
