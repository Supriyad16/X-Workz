package com.xworkz.task.today;

public class Bat {

    private String material;
    private String brand;
    private double price;

    public Bat(String material, String brand, double price) {
        this.material = material;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return 9;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", brand=" + brand + ", price=" + price + "]";
    }
}
