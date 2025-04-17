package com.xworkz.rules;

public interface Bench {

    void sit();

    void move();

    void clean();

    default void write(){
        System.out.println("write on the bench");
    }
}
