package com.xworkz.rules;

public interface Fork {

    void poke();

    void lift();

    void wash();

    default void eat(){
        System.out.println("eat using fork");
    }
}
