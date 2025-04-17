package com.xworkz.rules;

public interface Cap {

    void wear();

    void adjust();

    void remove();

    default void close(){
        System.out.println("close the bottle");
    }
}
