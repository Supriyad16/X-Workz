package com.xworkz.rules;

public interface Pin {

    void stick();

    void remove();

    void bend();

    default void pinch(){
        System.out.println("pinch through pin");
    }
}
