package com.company.Lesson02;

public class Method {

    public static void main(String[] args) {
        int  x=  sum(41,36);
        int  y=  sum(4,6);
        System.out.println(x);
        System.out.println(y);
   String f=44+44 +"33";
   String n=f.replace("88","KKK");  // replace- змінює значення 1 на 2 ("1", "2").contains("8"));

        boolean ba="44".contains("443");
        System.out.println(ba);
        System.out.println(  f.equals("longggg"));  // порівнює стрічки

        System.out.println(f.equals("8833"));
        System.out.println(n);


    }



    static int sum(int a, int b){
        return a+b;

    }

}


