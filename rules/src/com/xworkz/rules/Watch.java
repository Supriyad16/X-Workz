package com.xworkz.rules;

public interface Watch {

    void showTime();

    void setAlarm();

    void tick();

    default void showDate(){
        System.out.println("watch shows date");
    }
}
