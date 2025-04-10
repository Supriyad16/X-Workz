package com.xworkz.task.today;

public class Sweets {
    private String name;
    private double weight;
    private boolean isSugarFree;

    public Sweets(String name, double weight, boolean isSugarFree) {
        this.name = name;
        this.weight = weight;
        this.isSugarFree = isSugarFree;
    }


    @Override
    public int hashCode() {
        return 84;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", weight=" + weight + "g, isSugarFree=" + isSugarFree + "]";
    }
}
