package com.company.Lesson04.Different;

public class PriceFlowers {

    public static void main(String[] args) {

        Rose rosedark = new Rose("Dark", 30);
        Rose roselight = new Rose("Light", 40);
        Tulpan tulpan = new Tulpan("red", 20);
        Flower[] flowers = {rosedark, roselight, tulpan,roselight,rosedark};
        int sum =0;
        for(Flower flower:flowers){
            flower.smells();
            sum+= flower.getPrice();
        }
        System.out.println(sum);

    }
}