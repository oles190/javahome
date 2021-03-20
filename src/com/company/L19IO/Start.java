package com.company.L19IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        String date = "";
        try (InputStream inputStream = new FileInputStream("/Users/olesdoskuc/IdeaProjects/javahome/src/com/company/L19IO/input.txt");
        ) {

            while (inputStream.available() > 0) {

                date += (char) inputStream.read();
            }
            System.out.println(date);


        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
        List<Person> people = new ArrayList<>();
        for (String line : date.split("\n")) {
            String[] elems = line.split(",");
            Person person = new Person(elems[0].trim(), Integer.parseInt(elems[1].trim()));
            people.add(person);


        }
        System.out.println(people);

    }


}