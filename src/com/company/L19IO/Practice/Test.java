package com.company.L19IO.Practice;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test {


    public static void main(String[] args) throws IOException {
//String str= "We are trying to write it " ;
//FileOutputStream fot =new FileOutputStream("/Users/olesdoskuc/IdeaProjects/javahome/src/com/company/L19IO/Practice/fff.txt");
//byte [] buffer= str.getBytes();
//fot.write(buffer);
//fot.write(buffer[3]);
//
        FileInputStream fot= new FileInputStream("/Users/olesdoskuc/IdeaProjects/javahome/src/com/company/L19IO/Practice/fff.txt");

String buffer="";
        while(fot.available()>0){
            buffer += (char) fot.read();
        }
        System.out.println(buffer);

    }
}




