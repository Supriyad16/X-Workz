package com.xworkz.task.today;

public class Necklace {
    private String type;
    private String metal;
    private double weight;

    public Necklace(String type, String metal, double weight) {
        this.type = type;
        this.metal = metal;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", metal=" + metal + ", weight=" + weight + "g]";
    }
}
