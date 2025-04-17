package com.xworkz.rules;

public interface Ruler {

    void measure();

    void mark();

    void draw();

    default void beat(){
        System.out.println("beat through ruler");
    }
}
