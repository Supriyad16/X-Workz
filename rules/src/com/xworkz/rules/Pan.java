package com.xworkz.rules;

public interface Pan {

    void heat();

    void cook();

    void clean();

    default void fry(){
        System.out.println("fry in pan");
    }
}
