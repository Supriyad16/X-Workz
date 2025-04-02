package com.xworkz.fest.work;

public class ComputerRunner {

    public static void main(String[] args) {

        Computer computer = new Device();
        computer.boot();
        computer.shutdown();
        computer.process();
        computer.connectToInternet();
        computer.storeData();



        Device device = new Device();
        device.batteryBackup();
        device.portability();
        device.webcam();
        device.touchpad();
        device.keyboardLight();
    }
}