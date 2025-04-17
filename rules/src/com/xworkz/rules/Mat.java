package com.xworkz.rules;

public interface Mat {

    void lay();

    void step();

    void clean();

    default void sweep(){
        System.out.println("sweep using mat");
    }
}
