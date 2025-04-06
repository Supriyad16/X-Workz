package com.xworkz.fest.work;

public class Priest extends Ghost {

    Priest() {
        super();
        System.out.println("A Poltergeist is causing chaos!");
    }

    @Override
    public void haunt() {
        System.out.println("The ghost is haunting.");
    }

    @Override
    public void disappear() {
        System.out.println("The ghost disappear.");
    }

    @Override
    public void weirdNoises() {
        System.out.println("The ghost makes noises at midnight");
    }

    @Override
    public void magic() {
        System.out.println("The ghost do magic at night.");
    }

    @Override
    public void floatAround() {
        System.out.println("The ghost is floating around.");
    }

}
