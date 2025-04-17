package com.xworkz.rules;

public interface Table {

    void place();

    void clean();

    void move();

    default void study(){
        System.out.println("study on table");
    }
}
