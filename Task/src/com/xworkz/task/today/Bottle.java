package com.xworkz.task.today;

public class Bottle {
    private String brand;
    private double capacity;
    private boolean isReusable;

    public Bottle(String brand, double capacity, boolean isReusable) {
        this.brand = brand;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    @Override
    public int hashCode() {
        return 12;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "L, isReusable=" + isReusable + "]";
    }
}
