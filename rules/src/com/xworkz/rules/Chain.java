package com.xworkz.rules;

public interface Chain {

    void link();

    void swing();

    void lock();

    default void beauty(){
        System.out.println("Chain is beautiful");
    }
}
