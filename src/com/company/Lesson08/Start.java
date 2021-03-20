package com.company.Lesson08;

import com.company.Lesson07HW.SortEmail;
import com.company.Lesson07HW.User;

import java.util.*;

public class Start {
    public static void main(String[] args) {

List<Buy> list= new ArrayList<>();

        list.add(new Buy("Banana", 100));
        list.add(new Buy("Apple",50));
        list.add(new Buy("Beer", 150));

        Collections.sort(list, new BuyComperator());

for(Buy buy :list){
    System.out.println(buy.getName());
}
    }
}