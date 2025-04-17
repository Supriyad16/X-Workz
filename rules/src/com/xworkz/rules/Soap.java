package com.xworkz.rules;

public interface Soap {

    void lather();

    void wash();

    void dry();

    default void clean(){
        System.out.println("clean using soap");
    }
}
