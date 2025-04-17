package com.xworkz.rules;

public interface Pole {

    void stand();

    void support();

    void climb();

    default void connects(){
        System.out.println("poles connects to different pole");
    }
}
