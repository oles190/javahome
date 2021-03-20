package com.company.Lesson15.Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Person person1 = new Person("Oles", "Doskuch", 21);
        Person person2 = new Person("Oleg", "Lab", 12);
        Person person3 = new Person("Mark", "Send", 21);


        Map<Person, String> map = new HashMap<>();
        map.put(person1,"Telegram");
        map.put(person2,"Instagram");
        map.put(person3,"Viber");
        System.out.println(map);
        Iterator <Map.Entry<Person, String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){            // REMOVE SOME PERSON
            if(iterator.next().getKey().getAge()<18){
           iterator.remove();

            }
        }

        map.put(person1,""); //REMOVE ACAUNT





        System.out.println(map);   // all the map
    }
}