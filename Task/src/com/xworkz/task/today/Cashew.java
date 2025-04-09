package com.xworkz.task.today;

public class Cashew {
    private String quality;
    private double weight;
    private boolean salted;

    public Cashew(String quality, double weight, boolean salted) {
        this.quality = quality;
        this.weight = weight;
        this.salted = salted;
    }

    @Override
    public String toString() {
        return "[quality=" + quality + ", weight=" + weight + "g, salted=" + salted + "]";
    }
}
