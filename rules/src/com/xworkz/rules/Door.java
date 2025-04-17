package com.xworkz.rules;

public interface Door {

    void open();

    void close();

    void lock();

    default void wood(){
        System.out.println("door is made of wood");
    }
}
