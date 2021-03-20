package com.company.Lesson15.Practice;



import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;



public class Task16 {
    public static void main(String[] args) {





        Person person1 = new Person("Oles", "Doskuch", 19);
        System.out.println(person1.getClass() == Person.class);
       Class dd=person1.getClass();
        System.out.println("class "+dd);

        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields(); // виводить всі поля класу
        for (Field field : declaredFields) {
            System.out.println(field);
        }


        System.out.println("");


        Class<Person> person1Class = Person.class;
        Method[] declaredMethods = person1Class.getDeclaredMethods();   // виводить всі методи
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        System.out.println("constructor:");
        Constructor constructor =personClass.getConstructors()[0];//виводить конструктур

        System.out.println(constructor);

    }}




