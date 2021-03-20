package com.company.Lesson05Fight;

import com.company.Lesson04.fight.Fighter;

public class Axe extends Fighter {

    public Axe(String name, int hp, int damage) {
        super(name, hp, damage+20);
    }
}
