package com.company.Lesson04.fight;

public class Fight {

    public static void main(String[] args) {
Fighter[] allTheFighters= new Fighter[3];
allTheFighters[0]=new Axe("Axe",100,70);
allTheFighters[1]= new Luna("Luna",100,70);
allTheFighters[2]= new Slark("Slark",100,80);
        System.out.println(" TODAY FIGHT ");

        for (Fighter one:allTheFighters){
            System.out.println(one.toString());
        }
        System.out.println("START FIGHTING");
        int fighters=allTheFighters.length;
        while(fighters!=1){
            int fighter1 = (int)Math.floor(Math.random() * allTheFighters.length);
            int fighter2 = (int)Math.floor(Math.random() * allTheFighters.length);
            if (fighter1 != fighter2 && allTheFighters[fighter1].isAlive() && allTheFighters[fighter2].isAlive()) {
                allTheFighters[fighter1].attack(allTheFighters[fighter2]);
                if (!allTheFighters[fighter2].isAlive()) {
                    fighters--;

                }
            }
        }

        for (Fighter one : allTheFighters) {
            if (one.isAlive()) {
                System.out.println("\n" + one.getName().toUpperCase() + " WIN THE FIGHT!!!");
            }
        }
    }
}






