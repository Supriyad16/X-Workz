package com.xworkz.task.today;

public class Radio {

    private String brand;
    private boolean isDigital;
    private double frequencyRange;

    public Radio(String brand, boolean isDigital, double frequencyRange) {
        this.brand = brand;
        this.isDigital = isDigital;
        this.frequencyRange = frequencyRange;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", isDigital=" + isDigital + ", frequencyRange=" + frequencyRange + "MHz]";
    }
}
