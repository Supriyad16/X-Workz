package com.xworkz.rules;

public interface Chair {

    void sit();

    void fold();

    void move();

    default void relax(){
        System.out.println("Relax on the chair");
    }
}
