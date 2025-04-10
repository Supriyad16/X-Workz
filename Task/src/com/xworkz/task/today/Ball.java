package com.xworkz.task.today;

public class Ball {

    private String color;
    private String type;
    private double weight;

    public Ball(String color, String type, double weight) {
        this.color = color;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return 6;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", type=" + type + ", weight=" + weight + "g]";
    }
}
