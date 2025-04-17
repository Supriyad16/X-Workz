package com.xworkz.rules;

public interface Lamp {

    void switchOn();

    void switchOff();

    void glow();

    default void light(){
        System.out.println("lamp give lamp");
    }
}
