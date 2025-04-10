package com.xworkz.task.today;

public class Diamond {
    private double carat;
    private String clarity;
    private double price;

    public Diamond(double carat, String clarity, double price) {
        this.carat = carat;
        this.clarity = clarity;
        this.price = price;
    }


    @Override
    public int hashCode() {
        return 26;
    }

    @Override
    public String toString() {
        return "[carat=" + carat + ", clarity=" + clarity + ", price=" + price + "]";
    }
}
