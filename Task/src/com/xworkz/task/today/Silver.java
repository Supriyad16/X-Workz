package com.xworkz.task.today;

public class Silver {
    private double purity;
    private double weight;
    private double price;

    public Silver(double purity, double weight, double price) {
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

                Silver silver= this;
                Silver silver1= (Silver) obj;
                if (silver1.purity==(silver.purity) && silver1.weight==silver.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 77;
    }

    @Override
    public String toString() {
        return "[purity=" + purity + "%, weight=" + weight + "g, price=" + price + "]";
    }
}
