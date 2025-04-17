package com.xworkz.rules;

public interface File {

    void open();

    void read();

    void close();

    default void edit(){
        System.out.println("edit the file");
    }
}
