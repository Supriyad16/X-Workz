package com.xworkz.task.today;

public class Band {

    private String material;
    private String usage;
    private double price;

    public Band(String material, String usage, double price) {
        this.material = material;
        this.usage = usage;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", usage=" + usage + ", price=" + price + "]";
    }
}
