package com.xworkz.rules;

public interface Ball {

    void bounce();

    void roll();

    void throwBall();

    default void material(){
        System.out.println("Ball is made of different material");
    }
}