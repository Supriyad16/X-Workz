package com.xworkz.rules;

public interface Bat {

    void swing();

    void hit();

    void grip();

    default void happy(){
        System.out.println("BE happy whhile playing");
    }
}
