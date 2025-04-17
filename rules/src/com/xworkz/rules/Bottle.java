package com.xworkz.rules;

public interface Bottle {

    void fill();

    void pour();

    void closeCap();

    default void drink(){
        System.out.println("Drink the water");
    }
}
