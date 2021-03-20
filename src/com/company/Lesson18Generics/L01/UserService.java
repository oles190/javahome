package com.company.Lesson18Generics.L01;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class UserService<T extends Account,K extends  User> {



    public void printAllUsers(Set<K> users){
        System.out.println("Print all the users");

        for(K user:users){
            System.out.println(user);
        }
    }

    public void printAllAccount(Collection<T> accounts){
        System.out.println("Print all the Accounts");
        for(T account:accounts){
            System.out.println(account);
        }



    }
    public double  GetCharge(T account){
        System.out.println("Calculate ");
        return  account.getSum()*0.05;
    }





}