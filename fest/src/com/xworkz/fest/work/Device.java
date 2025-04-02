package com.xworkz.fest.work;

public class Device extends Computer {

    Device() {
        super();
        System.out.println("Laptop class");
    }

    public void batteryBackup() {
        System.out.println("Laptop has a battery backup");
    }

    public void portability() {
        System.out.println("Laptop is portable");
    }

    public void webcam() {
        System.out.println("Laptop has a webcam");
    }

    public void touchpad() {
        System.out.println("Laptop has a touchpad");
    }

    public void keyboardLight() {
        System.out.println("Laptop has a backlit keyboard");
    }
}