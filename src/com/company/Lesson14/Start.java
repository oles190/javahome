package com.company.Lesson14;

import java.util.*;

public class Start   {


    public static void main(String[] args) {
        Set<Person> set = new TreeSet<>();
        set.add(new Person("Oles", 22));
        set.add(new Person("Maks", 23));
        set.add(new Person("Andriy", 19));


        Set<Person>set1 =new LinkedHashSet<>();
        set1.add(new Person("Oles", 22));
        set1.add(new Person("Maks", 23));
        set1.add(new Person("Andriy", 19));
        System.out.println(set1);
        // Iterator<Person>iterator=set.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
 //}

        System.out.println(set);
              }
    }




