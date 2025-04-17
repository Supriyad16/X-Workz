package com.xworkz.external;

import com.xworkz.rules.Toy;

public class RobotToy implements Toy {

    @Override
    public void play() {
        System.out.println("Playing with the robot toy");
    }

    @Override
    public void makeSound() {
        System.out.println("Robot toy makes mechanical sounds");
    }

    @Override
    public void move() {
        System.out.println("Robot toy is moving forward");
    }

    @Override
    public void entertain(){
        System.out.println("robot toy gives entertainment");
    }

    public static void main(String[] args) {
        RobotToy robotToy = new RobotToy();
        robotToy.play();
        robotToy.makeSound();
        robotToy.move();
        robotToy.entertain();
    }
}
