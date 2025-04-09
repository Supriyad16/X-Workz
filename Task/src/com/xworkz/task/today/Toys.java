package com.xworkz.task.today;

public class Toys {
    private String name;
    private String ageGroup;
    private double price;

    public Toys(String name, String ageGroup, double price) {
        this.name = name;
        this.ageGroup = ageGroup;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", ageGroup=" + ageGroup + ", price=" + price + "]";
    }
}
