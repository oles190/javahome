package com.company.Lesson05;

import java.util.ArrayList;
import java.util.List;

public class Colect {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Collectione");
        list.add("Java");
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.contains("Hello"));
        for(String string:list){
            System.out.println(string);
        }
        System.out.println(list.size());
    }
}