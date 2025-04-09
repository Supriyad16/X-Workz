package com.xworkz.task.today;

public class Paint {

    private String brand;
    private String color;
    private double price;

    public Paint(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }
}
