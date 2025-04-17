package com.xworkz.rules;

public interface Toy {

    void play();

    void makeSound();

    void move();

    default void entertain(){
        System.out.println("entertain the kid");
    }
}
