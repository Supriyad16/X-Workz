package com.xworkz.task.today;

public class Ground {
    private String name;
    private String type;
    private double area;

    public Ground(String name, String type, double area) {
        this.name = name;
        this.type = type;
        this.area = area;
    }

    @Override
    public int hashCode() {
        return 34;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", type=" + type + ", area=" + area + " sq.m]";
    }
}
