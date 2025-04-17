package com.xworkz.rules;

public interface Plate {

    void serve();

    void clean();

    void stack();

    default void breakfast(){
        System.out.println("eat breakfast in plate");
    }
}
