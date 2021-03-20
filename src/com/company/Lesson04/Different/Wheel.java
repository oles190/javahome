package com.company.Lesson04.Different;

public class Wheel {
    private int wheelWidht;
    private int wheelTirHeight;
    private int diameters;
    private String season;


    public Wheel(int wheelTirHeight,int wheelWidht,int diameters){
        this.diameters=diameters;
        this.wheelTirHeight=wheelTirHeight;
        this. wheelWidht=wheelWidht;
        this.season="Summer";
    }

    public int getWheelWidht() {
        return wheelWidht;
    }

    public void setWheelWidht(int wheelWidht) {
        this.wheelWidht = wheelWidht;
    }

    public int getWheelTirHeight() {
        return wheelTirHeight;
    }

    public void setWheelTirHeight(int wheelTirHeight) {
        this.wheelTirHeight = wheelTirHeight;
    }

    public int getDiameters() {
        return diameters;
    }

    public void setDiameters(int diameters) {
        this.diameters = diameters;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }


    @Override
    public  String toString() {
        return "Wheels: " + wheelWidht + "/" + wheelTirHeight + "/R" + diameters + "; season: " + season + ".";
    }
    public void installSportsTires() {
        this.wheelWidht = wheelWidht + 10;
        this.wheelTirHeight = wheelTirHeight + 5;
        this.diameters = diameters + 1;
    }
}
