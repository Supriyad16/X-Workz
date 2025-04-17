package com.xworkz.rules;

public interface Spoon {

    void stir();

    void scoop();

    void eat();

    default void mix(){
        System.out.println("mix the items");
    }
}
