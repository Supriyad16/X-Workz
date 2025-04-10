package com.xworkz.task.today;

public class Jeans {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Jeans(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public int hashCode() {
        return 40;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}