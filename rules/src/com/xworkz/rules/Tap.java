package com.xworkz.rules;

public interface Tap {

    void open();

    void close();

    void leak();

    default void flow(){
        System.out.println("water flows through tap");
    }
}
