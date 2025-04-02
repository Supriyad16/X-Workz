package com.xworkz.fest.work;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal = new Bird();
        animal.eat();
        animal.sleep();
        animal.breathe();
        animal.move();
        animal.grow();

        System.out.println("*****");

        Bird bird = new Bird();
        bird.fly();
        bird.sing();
        bird.layEggs();
        bird.buildNest();
        bird.migrate();
    }
}
