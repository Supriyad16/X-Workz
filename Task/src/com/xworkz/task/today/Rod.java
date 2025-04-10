package com.xworkz.task.today;

public class Rod {

    private String material;
    private double length;
    private double diameter;

    public Rod(String material, double length, double diameter) {
        this.material = material;
        this.length = length;
        this.diameter = diameter;
    }


    @Override
    public int hashCode() {
        return 72;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + "m, diameter=" + diameter + "cm]";
    }
}
