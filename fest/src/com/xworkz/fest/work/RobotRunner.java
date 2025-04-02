package com.xworkz.fest.work;

public class RobotRunner {
    public static void main(String[] args) {

        Robot robot = new Machine();
        robot.move();
        robot.scanArea();
        robot.pickObjects();
        robot.recharge();
        robot.stop();



        Machine machine = new Machine();
        machine.recognizeSpeech();
        machine.processData();
        machine.makeDecisions();
        machine.performFacialRecognition();
        machine.automateTasks();
    }
}
