package com.company.Serialization;

import com.company.Lesson15.Practice.Personn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StartSer {
    public static void main(String[] args) {


        List<Person> people = new ArrayList<>();
        List<Person> newPerson= new ArrayList<>();
        people.add(new Person("Oles", 21,5000));
        people.add(new Person("Andriy", 22,4000));


        try (FileOutputStream fileOutputStream = new FileOutputStream("/Users/olesdoskuc/IdeaProjects/javahome/src/com/company/Serialization/input.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(people);
        } catch (
                IOException e) {
            System.out.println(e.getMessage());
        }


        try(FileInputStream fileInputStream = new FileInputStream("/Users/olesdoskuc/IdeaProjects/javahome/src/com/company/Serialization/input.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
        {
            newPerson=(List<Person>) objectInputStream.readObject();
            System.out.println(newPerson);
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }


}