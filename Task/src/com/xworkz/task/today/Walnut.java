package com.xworkz.task.today;

public class Walnut {
    private String variety;
    private boolean shelled;
    private double weight;

    public Walnut(String variety, boolean shelled, double weight) {
        this.variety = variety;
        this.shelled = shelled;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Walnut walnut = this;
                Walnut walnut1 = (Walnut) obj;
                if (walnut1.variety.equals(walnut1.variety) && walnut1.weight==walnut1.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 98;
    }

    @Override
    public String toString() {
        return "[variety=" + variety + ", shelled=" + shelled + ", weight=" + weight + "g]";
    }
}
