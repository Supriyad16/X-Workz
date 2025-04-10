package com.xworkz.task.today;

public class Charger {

    private String brand;
    private int wattage;
    private boolean fastCharging;

    public Charger(String brand, int wattage, boolean fastCharging) {
        this.brand = brand;
        this.wattage = wattage;
        this.fastCharging = fastCharging;
    }


    @Override
    public int hashCode() {
        return 18;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", wattage=" + wattage + "W, fastCharging=" + fastCharging + "]";
    }
}
