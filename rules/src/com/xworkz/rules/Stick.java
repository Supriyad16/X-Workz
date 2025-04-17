package com.xworkz.rules;

public interface Stick {

    void hold();

    void hit();

    void breakStick();

    default void join(){
        System.out.println("join the stick");
    }
}
