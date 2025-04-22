package com.xworkz.information.internal;

public class LibraryImp implements Library {

    public LibraryImp() {
        System.out.println("No-arg constructor of LibraryImp");
    }

    @Override
    public void open() {
        System.out.println("Running open in LibraryImp");
    }
}
