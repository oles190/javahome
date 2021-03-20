package com.company.Lesson04.Different;

public  class Start extends Robot {
    public static void main(String[] args) {


        CoffeRobot coffeRobot = new CoffeRobot();
        DancerRobot danceRob = new DancerRobot();
        RobotCoocker robotCoocker = new RobotCoocker();
        Robot robot = new Robot();
        robot.work();
        coffeRobot.work();
        robotCoocker.work();
        danceRob.work();

        Robot[] robotsArray = new Robot[4];
        robotsArray[0] = robot;
        robotsArray[1] = robotCoocker;
        robotsArray[2] = danceRob;
        robotsArray[3] = coffeRobot;

        for (Robot a : robotsArray) {
            a.work();


        }
    }
}