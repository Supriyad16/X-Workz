package com.xworkz.rules;

public interface Clip {

    void hold();

    void release();

    void open();

    default void wears(){
        System.out.println("wear the clip");
    }
}
