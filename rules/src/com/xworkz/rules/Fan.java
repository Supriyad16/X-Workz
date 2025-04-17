package com.xworkz.rules;

public interface Fan {

    void spin();

    void switchOn();

    void cleans();

    default void switchOff(){
        System.out.println("fan is off");
    }
}
