package com.xworkz.fest.work;

public class CatRunner {
    public static void main(String[] args) {

        Cat cat = new Kitten();
        cat.meow();
        cat.sleep();
        cat.eat();
        cat.play();
        cat.scratchFurniture();


        Kitten kitten = new Kitten();
        kitten.meow();
        kitten.sleep();
        kitten.play();
        kitten.eat();
        kitten.scratchFurniture();
    }
}