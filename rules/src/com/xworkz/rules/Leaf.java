package com.xworkz.rules;

public interface Leaf {

    void photosynthesize();

    void fall();

    void grow();

    default void colour(){
        System.out.println("Leaf has different colours");
    }
}
