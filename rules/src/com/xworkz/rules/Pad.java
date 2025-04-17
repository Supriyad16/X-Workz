package com.xworkz.rules;

public interface Pad {

    void write();

    void tear();

    void bind();

    default void support(){
        System.out.println("pad gives support to write");
    }
}
