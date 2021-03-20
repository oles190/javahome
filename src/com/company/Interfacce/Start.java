package com.company.Interfacce;


public class Start {
    public static void main(String[] args) {
        FixSalary employee1 = new FixSalary(4242423);
        FixSalary employee2 = new FixSalary(434224);
        HoursSalary employee3 = new HoursSalary(19999,228);
//        employee3.setHours(30);
        HoursSalary employee4 = new HoursSalary(13099,229);
//        employee4.setHours(33);

        Employee[] employees = {employee1,employee2,employee3,employee4};
Service serv= new Service();
        for(Employee employee:employees){
         serv.pay(employee);
        }
    }



}
