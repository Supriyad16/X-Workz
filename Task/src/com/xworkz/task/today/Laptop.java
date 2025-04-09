package com.xworkz.task.today;

public class Laptop {
    private String brand;
    private int ram;
    private double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", ram=" + ram + "GB, price=" + price + "]";
    }
}
