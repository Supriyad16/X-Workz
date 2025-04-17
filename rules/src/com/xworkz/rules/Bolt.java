package com.xworkz.rules;

public interface Bolt {

    void tighten();

    void loosen();

    void rust();

    default void stuck(){
        System.out.println("bolt has stuck in the door");
    }
}
