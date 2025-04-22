package com.xworkz.information.internal;

public class BookImp implements Book {

    public BookImp() {
        System.out.println("No-arg constructor of BookImp");
    }

    @Override
    public void read() {
        System.out.println("Running read in BookImp");
    }
}
