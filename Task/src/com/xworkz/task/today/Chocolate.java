package com.xworkz.task.today;

public class Chocolate {

    private String brand;
    private String flavor;
    private double weight;

    public Chocolate(String brand, String flavor, double weight) {
        this.brand = brand;
        this.flavor = flavor;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Chocolate chocolate = this;
                Chocolate  chocolate1 = (Chocolate) obj;
                if (chocolate1.brand.equals(chocolate.brand) && chocolate1.weight==chocolate.weight) {
                    System.out.println("Both aare same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 20;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", flavor=" + flavor + ", weight=" + weight + "g]";
    }
}
