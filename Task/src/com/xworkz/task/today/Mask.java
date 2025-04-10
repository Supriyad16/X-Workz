package com.xworkz.task.today;

public class Mask {

    private String type;
    private boolean isReusable;
    private double price;

    public Mask(String type, boolean isReusable, double price) {
        this.type = type;
        this.isReusable = isReusable;
        this.price = price;
    }


    @Override
    public int hashCode() {
        return 51;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", isReusable=" + isReusable + ", price=" + price + "]";
    }
}
