package com.xworkz.task.today;

public class Silk {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Silk(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }


    @Override
    public int hashCode() {
        return 76;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
