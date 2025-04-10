package com.xworkz.task.today;

public class Leather {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Leather(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public int hashCode() {
        return 47;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
