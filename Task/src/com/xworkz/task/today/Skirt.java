package com.xworkz.task.today;

public class Skirt {

    private String size;
    private String color;
    private double price;

    public Skirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", color=" + color + ", price=" + price + "]";
    }
}
