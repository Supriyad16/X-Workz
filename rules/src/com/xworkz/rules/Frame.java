package com.xworkz.rules;

public interface Frame {

    void hang();

    void support();

    void display();

    default void view(){
        System.out.println("view the frame");
    }
}
