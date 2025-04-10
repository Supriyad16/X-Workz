package com.xworkz.task.today;

public class NailPolish {

    private String shade;
    private String brand;
    private double price;

    public NailPolish(String shade, String brand, double price) {
        this.shade = shade;
        this.brand = brand;
        this.price = price;
    }


    @Override
    public int hashCode() {
        return 55;
    }

    @Override
    public String toString() {
        return "[shade=" + shade + ", brand=" + brand + ", price=" + price + "]";
    }
}
