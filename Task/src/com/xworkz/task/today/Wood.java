package com.xworkz.task.today;

public class Wood {

    private String type;
    private double weight;
    private String color;

    public Wood(String type, double weight, String color) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", weight=" + weight + "kg, color=" + color + "]";
    }
}
