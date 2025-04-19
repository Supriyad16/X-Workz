package com.xworkz.task.today;

public class Platinum {
    private double purity;
    private double weight;
    private double price;

    public Platinum(double purity, double weight, double price) {
        this.purity = purity;
        this.weight = weight;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Platinum platinum = this;
                Platinum platinum1 = (Platinum) obj;
                if (platinum1.purity==(platinum.purity) && platinum1.weight==platinum.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }


    @Override
    public int hashCode() {
        return 66;
    }

    @Override
    public String toString() {
        return "[purity=" + purity + "%, weight=" + weight + "g, price=" + price + "]";
    }
}
