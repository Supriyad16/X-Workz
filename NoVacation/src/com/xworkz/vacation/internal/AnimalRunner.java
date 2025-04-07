package com.xworkz.vacation.internal;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal = new Bird();
        animal.eat();
        animal.sleep();
        animal.breathe();
        animal.move();
        animal.grow();

        System.out.println("----");

        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.breathe();
        bird.move();
        bird.grow();

        System.out.println("----");

        Peacock peacock = new Peacock();
        peacock.grow();
        peacock.breathe();
        peacock.fly();
        peacock.move();
        peacock.eat();
        peacock.sleep();
    }
}