package com.xworkz.rules;

public interface Book {

    void open();

    void read();

    void close();

    default void wrote(){
        System.out.println("wrote on the book");
    }
}
