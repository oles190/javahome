package com.company.Lesson04.fight;

public class Fighter {
    public String name;
    private int hp;
   private int damage;
   private boolean isAlive = true;


    public Fighter(String name,int hp, int damage) {
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Fighter " + name + "" + hp +" " + damage;
    }

    public void attack(Fighter fighter) {
        System.out.println("Fighter " + name + " attacked" + " fighter " + fighter.name);
        fighter.setHp(fighter.getHp() - damage);
        if (fighter.getHp() > 0) {
            System.out.println("Fighter " + fighter.getName() + " still alive, health - " + fighter.getHp() + ".");
        } else {
            System.out.println("Fighter " + fighter.getName() + " dead");
            fighter.setAlive(false);
        }

    }
}