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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Toys toys = this;
                Toys toys1 = (Toys) obj;
                if (toys1.name.equals(toys.name) && toys1.price==toys.price) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 93;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", ageGroup=" + ageGroup + ", price=" + price + "]";
    }
}
