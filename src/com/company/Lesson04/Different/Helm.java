package com.company.Lesson04.Different;

public class Helm {

    private int diameter;
    private String material;
    private boolean chromeTrim;


    public Helm (int diameter, String material, boolean chromeTrim){
        this.diameter=diameter;
        this.chromeTrim=chromeTrim;
        this.material=material;
    }



    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isChromeTrim() {
        return chromeTrim;
    }

    public void setChromeTrim(boolean chromeTrim) {
        this.chromeTrim = chromeTrim;
    }
    public void changeDiameter() {
        this.diameter = 2 * (diameter / 3);
    }
    public void changeMaterial(String newMaterial){
        this.material=newMaterial;
    }

    @Override
    public String toString() {
        return "Helm: diameter - " + diameter + "; material - " + material + "; chromeTrim - " + chromeTrim + ".";
    }
}

