package com.xworkz.task.today;

public class Shoe {

    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public int hashCode() {
        return 74;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + ", color=" + color + "]";
    }
}
