package com.xworkz.task.today;

public class Cotton {

    private String quality;
    private double weight;
    private String use;

    public Cotton(String quality, double weight, String use) {
        this.quality = quality;
        this.weight = weight;
        this.use = use;
    }

    @Override
    public int hashCode() {
        return 23;
    }

    @Override
    public String toString() {
        return "[quality=" + quality + ", weight=" + weight + "kg, use=" + use + "]";
    }
}
