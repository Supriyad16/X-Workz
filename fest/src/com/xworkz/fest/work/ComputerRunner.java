package com.xworkz.fest.work;

public class ComputerRunner {

    public static void main(String[] args) {

        Computer computer = new Device();
        computer.boot();
        computer.shutdown();
        computer.process();
        computer.ports();
        computer.storeData();


        Device device = new Device();
        device.boot();
        device.shutdown();
        device.process();
        device.ports();
        device.storeData();
    }
}