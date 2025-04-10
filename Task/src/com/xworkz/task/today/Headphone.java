package com.xworkz.task.today;

public class Headphone {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Headphone(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public int hashCode() {
        return 35;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
