package com.xworkz.task.today;

public class Brush {
    private String type;
    private String brand;
    private boolean isElectric;

    public Brush(String type, String brand, boolean isElectric) {
        this.type = type;
        this.brand = brand;
        this.isElectric = isElectric;
    }

    @Override
    public int hashCode() {
        return 14;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isElectric=" + isElectric + "]";
    }
}
