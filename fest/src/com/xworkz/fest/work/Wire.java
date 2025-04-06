package com.xworkz.fest.work;

public class Wire extends Port {

    Wire() {
        super();
        System.out.println("Wire connected");
    }

    @Override
    public void connect() {
        System.out.println("Wire connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Wire disconnected");
    }

    @Override
    public void transferData() {
        System.out.println("Data is transferred through Wire");
    }

    @Override
    public void checkStatus() {
        System.out.println("Checking the status");
    }

    @Override
    public void powerSupply() {
        System.out.println("Providing power supply through Wire");

    }
}