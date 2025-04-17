package com.xworkz.rules;

public interface Brush {

    void clean();

    void paint();

    void dry();

    default void designPattern(){
        System.out.println("Design the wall");
    }
}
