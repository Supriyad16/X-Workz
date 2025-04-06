package com.xworkz.fest.work;

public class Device extends Computer {

    Device() {
        super();
        System.out.println("Laptop class");
    }

    @Override
    public void boot() {
        System.out.println("Device is booting up");
    }

    @Override
    public void shutdown() {
        System.out.println("Device is shutting down");
    }

    @Override
    public void process() {
        System.out.println("Device is processing data");
    }

    @Override
    public void ports() {
        System.out.println("Device have many ports");
    }

    @Override
    public void storeData() {
        System.out.println("Device is storing data");
    }
}