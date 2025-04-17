package com.xworkz.rules;

public interface Mirror {

    void reflect();

    void hang();

    void clean();

    default void refract(){
        System.out.println("mirror refracts");
    }
}
