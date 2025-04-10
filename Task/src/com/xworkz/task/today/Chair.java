package com.xworkz.task.today;

public class Chair {

    private String material;
    private String color;
    private double height;

    public Chair(String material, String color, double height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }

    @Override
    public int hashCode() {
        return 17;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", height=" + height + "]";
    }
}
