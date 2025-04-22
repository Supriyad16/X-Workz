package com.xworkz.information.internal;

public class RemoteImp implements Remote {

    public RemoteImp() {
        System.out.println("No-arg constructor of RemoteImp");
    }

    @Override
    public void control() {
        System.out.println("Controlling TV using RemoteImp");
    }
}
