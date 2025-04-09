package com.xworkz.task.today;

public class IronBox {
    private String brand;
    private int power;
    private boolean isSteam;

    public IronBox(String brand, int power, boolean isSteam) {
        this.brand = brand;
        this.power = power;
        this.isSteam = isSteam;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", power=" + power + "W, isSteam=" + isSteam + "]";
    }
}
