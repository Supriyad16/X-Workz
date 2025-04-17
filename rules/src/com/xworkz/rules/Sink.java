package com.xworkz.rules;

public interface Sink {

    void wash();

    void drain();

    void clean();

    default void dirtyVessels(){
        System.out.println("sink have dirty vessels");
    }
}
