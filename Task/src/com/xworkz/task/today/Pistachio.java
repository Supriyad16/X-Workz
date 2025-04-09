package com.xworkz.task.today;

public class Pistachio {
    private String type;
    private boolean opened;
    private double price;

    public Pistachio(String type, boolean opened, double price) {
        this.type = type;
        this.opened = opened;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", opened=" + opened + ", price=" + price + "]";
    }
}
