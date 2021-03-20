package com.company.Lesson05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words= new ArrayList<>();
        while(!words.contains("break")){
            words.add(scanner.next());

        }
        System.out.println("All the words");
for(String word:words){
    System.out.println(word);
}
        System.out.println("All the words witch start S");
        for(String word:words) {
            if (word.startsWith("s")) {
                System.out.println(word);
            }
        }
        System.out.println("Words what have more than 5 chars");
        for(String word:words) {
            if(word.length()>=5){
                System.out.println(word);
            }
        }



        }
    }

