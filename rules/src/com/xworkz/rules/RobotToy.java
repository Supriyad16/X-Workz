package com.xworkz.rules;

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

    public static void main(String[] args) {
        RobotToy toy = new RobotToy();
        toy.play();
        toy.makeSound();
        toy.move();
    }
}
