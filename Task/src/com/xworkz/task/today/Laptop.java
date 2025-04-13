package com.xworkz.task.today;

public class Laptop {
    private String brand;
    private int ram;
    private double price;

    public Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Laptop laptop = this;
                Laptop laptop1 = (Laptop) obj;
                if (laptop1.brand.equals(laptop1.brand) && laptop1.ram==laptop1.ram) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 45;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", ram=" + ram + "GB, price=" + price + "]";
    }
}
