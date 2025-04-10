package com.xworkz.task.today;

public class Bluetooth {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Bluetooth(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public int hashCode() {
        return 11;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
