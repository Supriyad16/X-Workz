package com.xworkz.task.today;

public class Platinum {
    private double purity;
    private double weight;
    private double price;

    public Platinum(double purity, double weight, double price) {
        this.purity = purity;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[purity=" + purity + "%, weight=" + weight + "g, price=" + price + "]";
    }
}
