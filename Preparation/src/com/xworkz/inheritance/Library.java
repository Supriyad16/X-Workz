package com.xworkz.inheritance;

public abstract class Library {
    String name;

    abstract void books(String name);


     void read(){
        System.out.println("Read books");
    }

    public static void write(){
        System.out.println("Write books");
    }
}
