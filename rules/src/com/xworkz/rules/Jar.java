package com.xworkz.rules;

public interface Jar {

    void open();

    void store();

    void close();

    default void container(){
        System.out.println("jar is a container");
    }
}
