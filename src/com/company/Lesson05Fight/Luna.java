package com.company.Lesson05Fight;

import com.company.Lesson04.fight.Fighter;

public class Luna extends Fighter {
    public Luna(String name, int hp, int damage) {
        super(name, hp, damage+25);
    }
}
