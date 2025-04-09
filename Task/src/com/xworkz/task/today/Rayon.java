package com.xworkz.task.today;

public class Rayon {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Rayon(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
