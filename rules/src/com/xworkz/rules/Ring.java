package com.xworkz.rules;

public interface Ring {

    void wear();

    void remove();

    void resize();

    default void designs(){
        System.out.println("rings have different designs");
    }
}
