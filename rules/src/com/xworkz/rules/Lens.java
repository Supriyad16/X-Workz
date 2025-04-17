package com.xworkz.rules;

public interface Lens {

    void focus();

    void zoom();

    void adjust();

    default void point(){
        System.out.println("lens has point");
    }
}
