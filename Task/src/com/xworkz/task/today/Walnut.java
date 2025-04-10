package com.xworkz.task.today;

public class Walnut {
    private String variety;
    private boolean shelled;
    private double weight;

    public Walnut(String variety, boolean shelled, double weight) {
        this.variety = variety;
        this.shelled = shelled;
        this.weight = weight;
    }


    @Override
    public int hashCode() {
        return 98;
    }

    @Override
    public String toString() {
        return "[variety=" + variety + ", shelled=" + shelled + ", weight=" + weight + "g]";
    }
}
