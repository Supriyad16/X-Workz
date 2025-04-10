package com.xworkz.task.today;

public class Pins {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Pins(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public int hashCode() {
        return 62;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
