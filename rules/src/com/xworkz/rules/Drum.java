package com.xworkz.rules;

public interface Drum {

    void beat();

    void carry();

    void tune();

    default void sound(){
        System.out.println("sound from drum");
    }
}
