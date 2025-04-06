package com.xworkz.fest.work;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal = new Bird();
        animal.eat();
        animal.sleep();
        animal.breathe();
        animal.move();
        animal.grow();


        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.breathe();
        bird.move();
        bird.grow();
    }
}
