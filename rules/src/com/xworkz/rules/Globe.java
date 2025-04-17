package com.xworkz.rules;

public interface Globe {

    void rotate();

    void point();

    void study();

    default void mark(){
        System.out.println("mark the location");
    }
}
