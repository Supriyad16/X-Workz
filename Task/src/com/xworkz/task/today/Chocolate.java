package com.xworkz.task.today;

public class Chocolate {

    private String brand;
    private String flavor;
    private double weight;

    public Chocolate(String brand, String flavor, double weight) {
        this.brand = brand;
        this.flavor = flavor;
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return 20;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", flavor=" + flavor + ", weight=" + weight + "g]";
    }
}
