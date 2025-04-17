package com.xworkz.rules;

public interface Bag {

    void carry();

    void hold();

    void store();

    default void design(){
        System.out.println("Bag has beautiful design");
    }
}