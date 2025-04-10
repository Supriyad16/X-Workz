package com.xworkz.task.today;

public class Mouse {

    private String brand;
    private String type;
    private double price;

    public Mouse(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }


    @Override
    public int hashCode() {
        return 53;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
