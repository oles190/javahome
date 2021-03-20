package com.company.Lesson18Generics;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<People> people=new ArrayList<>();

        people.add(new People("Oles","Doskuch",21));
        people.add(new People("Solomiya","Doskuch",23));
        List<Person> person=new ArrayList<>();
        person.add(new Person("Oll","DDD",12));



        meth(people);
        meth(person);



    }



    private static void meth(List<? extends People > list) {
  for(People people:list){
      System.out.println(people);
  }

    }
    }

