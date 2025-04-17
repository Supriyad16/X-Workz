package com.xworkz.rules;

public interface Tent {

    void setUp();

    void fold();

    void shelter();

    default void trip(){
        System.out.println("tent used in trip");
    }
}
