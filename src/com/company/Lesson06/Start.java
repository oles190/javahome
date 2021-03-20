package com.company.Lesson06;

import java.util.*;

public class Start {

    public static void main(String[] args) {


        List<Car> list1 = new ArrayList<>();
        list1.add(new Car(2005, "BMW"));
        list1.add(new Car(2015, "Mers"));
        list1.add(new Car(2012, "Nissan"));
        list1.add(new Car(2020, "Tesla"));


        Collections.sort(list1, new SortModel() );


        for (Car car: list1){
    System.out.println(car.getModel() +" "+car.getYear());
}


    }
}