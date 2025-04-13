package com.xworkz.task.today;

public class Necklace {
    private String type;
    private String metal;
    private double weight;

    public Necklace(String type, String metal, double weight) {
        this.type = type;
        this.metal = metal;
        this.weight = weight;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Necklace necklace = this;
                Necklace necklace1 = (Necklace) obj;
                if (necklace1.type.equals(necklace.type) && necklace1.weight==necklace1.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 56;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", metal=" + metal + ", weight=" + weight + "g]";
    }
}
