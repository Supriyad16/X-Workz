package com.xworkz.rules;

public interface Clock {

    void showTime();

    void tick();

    void alarm();

    default void setTime(){
        System.out.println("set the time");
    }
}
