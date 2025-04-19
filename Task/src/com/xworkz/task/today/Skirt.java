package com.xworkz.task.today;

public class Skirt {

    private String size;
    private String color;
    private double price;

    public Skirt(String size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Skirt skirt = this;
                Skirt skirt1 = (Skirt) obj;
                if (skirt1.size.equals(skirt.size) && skirt1.price==skirt.price) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 78;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", color=" + color + ", price=" + price + "]";
    }
}
