package com.xworkz.rules;

public interface Towel {

    void dry();

    void wash();

    void fold();

    default void clean(){
        System.out.println("clean the body");
    }
}
