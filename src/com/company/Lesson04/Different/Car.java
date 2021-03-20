package com.company.Lesson04.Different;

public class Car {
    private String model;
    private int maxSpeed;
    private Wheel wheel;
    private CarBody carBody;
    private Helm helm;





    public Car(String model, int maxSpeed, Wheel wheel, CarBody carBody, Helm helm){
        this.model=model;
        this.maxSpeed=maxSpeed;
        this.carBody=carBody;
        this.helm=helm;
        this.wheel=wheel;
    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public Helm getHelm() {
        return helm;
    }

    public void setHelm(Helm helm) {
        this.helm = helm;
    }


    public String toString() {
        return "Model of this car is: " + model + "\nmax speed of this car is: " + maxSpeed + " km/hour\n" + helm.toString() + "\n" + wheel.toString() + "\n" + carBody.toString();
    }

}
