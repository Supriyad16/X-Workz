package com.xworkz.task.today;

public class Gold {
    private double purity;
    private double weight;
    private double price;

    public Gold(double purity, double weight, double price) {
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

                Gold gold = this;
                Gold gold1 = (Gold) obj;
                if (gold1.purity==(gold1.purity) && gold1.weight==gold1.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 33;
    }

    @Override
    public String toString() {
        return "[purity=" + purity + "%, weight=" + weight + "g, price=" + price + "]";
    }
}
