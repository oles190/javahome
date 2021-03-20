package com.company.Lesson15.Practice;

import java.util.*;

public class Task2 {





    public static void main(String[] args) {
        List<String>list= new LinkedList<>();
        list.add("Instagram");
        list.add("Viber");
        list.add("Telegram");
        list.add("Privat24");


        Scanner scanner = new Scanner(System.in);
        Person person1= new Person("Oles","Doskuch",21 );
        Person person2= new Person("Andriy","Pelekh",22 );
        Person person3= new Person("Marki","Pris",23 );


        Map<Person,List<String>> map = new HashMap<>();
        map.put(person1,list);
        map.put(person2,list);
        map.put(person3,list);
        System.out.println(map);
        map.put(person3,list);  //add new acaunt
       map.remove(person1);


        map.put(new Person("Oleg","Mayak",22), list);

        System.out.println(map);






    }


    }






