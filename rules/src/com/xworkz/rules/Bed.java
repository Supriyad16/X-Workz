package com.xworkz.rules;

public interface Bed {

    void sleep();

    void fold();

    void makeBed();

    default void peace(){
        System.out.println("have peace in life");
    }
}
