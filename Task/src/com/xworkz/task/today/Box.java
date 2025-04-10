package com.xworkz.task.today;

public class Box {
    private String material;
    private double length;
    private double width;

    public Box(String material, double length, double width) {
        this.material = material;
        this.length = length;
        this.width = width;
    }

    @Override
    public int hashCode() {
        return 13;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + " cm, width=" + width + " cm]";
    }
}
