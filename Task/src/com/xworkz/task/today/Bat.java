package com.xworkz.task.today;

public class Bat {

    private String material;
    private String brand;
    private double price;

    public Bat(String material, String brand, double price) {
        this.material = material;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Bat bat = this;
                Bat bat1 = (Bat) obj;
                if (bat.brand.equals(bat1.brand) && bat.material==bat1.material) {
                    System.out.println("Both aare same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 9;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", brand=" + brand + ", price=" + price + "]";
    }
}
