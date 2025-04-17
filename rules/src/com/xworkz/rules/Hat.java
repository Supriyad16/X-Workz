package com.xworkz.rules;

public interface Hat {

    void wear();

    void remove();

    void style();

    default void protect(){
        System.out.println("protect from sun ");
    }
}
