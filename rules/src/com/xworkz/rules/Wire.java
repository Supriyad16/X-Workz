package com.xworkz.rules;

public interface Wire {

    void connect();

    void transmit();

    void insulate();

    default void tie(){
        System.out.println("tie using wire");
    }
}
