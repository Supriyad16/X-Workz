package com.xworkz.rules;

public interface Can {

    void pour();

    void openLid();

    void refill();

    default void spill(){
        System.out.println("Oil spilled");
    }
}
