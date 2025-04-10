package com.xworkz.task.today;

public class Speaker {

    private String brand;
    private int power;
    private boolean isBluetooth;

    public Speaker(String brand, int power, boolean isBluetooth) {
        this.brand = brand;
        this.power = power;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public int hashCode() {
        return 81;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", power=" + power + "W, isBluetooth=" + isBluetooth + "]";
    }
}
