package com.xworkz.rules;

public interface Bell {

    void ring();

    void hang();

    void sound();

    default void inform(){
        System.out.println("Inform to the owner");
    }
}
