package com.company.Lesson04.Different;

public class CarTest {

    public static void main(String[] args) {
Helm helm= new Helm(27,"zoloto",false);
Wheel wheel=new Wheel(41,27,18);
CarBody carBody= new CarBody("red");
Car car =new Car("BMW",250,wheel,carBody,helm);
        car.getWheel().setWheelWidht(343);
        System.out.println(car.toString());
        System.out.println("\n...CAR TUNING...\n");
        car.getHelm().changeMaterial("LLLL");
        car.getCarBody().changeColor("black");
        car.getWheel().installSportsTires();
    }


}
