package com.xworkz.task.today;

public class Silver {
    private double purity;
    private double weight;
    private double price;

    public Silver(double purity, double weight, double price) {
        this.purity = purity;
        this.weight = weight;
        this.price = price;
    }


    @Override
    public int hashCode() {
        return 77;
    }

    @Override
    public String toString() {
        return "[purity=" + purity + "%, weight=" + weight + "g, price=" + price + "]";
    }
}
