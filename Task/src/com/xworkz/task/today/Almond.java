package com.xworkz.task.today;

public class Almond {
    private String origin;
    private double weight;
    private boolean isRoasted;

    public Almond(String origin, double weight, boolean isRoasted) {
        this.origin = origin;
        this.weight = weight;
        this.isRoasted = isRoasted;
    }

    @Override
    public String toString() {
        return "[origin=" + origin + ", weight=" + weight + "g, isRoasted=" + isRoasted + "]";
    }
}
