package com.xworkz.rules;

public interface Pipe {

    void flow();

    void bends();

    void cut();

    default void connect(){
        System.out.println("Connect the pipe");
    }
}
