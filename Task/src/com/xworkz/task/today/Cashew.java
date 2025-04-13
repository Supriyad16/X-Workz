package com.xworkz.task.today;

public class Cashew {
    private String quality;
    private double weight;
    private boolean salted;

    public Cashew(String quality, double weight, boolean salted) {
        this.quality = quality;
        this.weight = weight;
        this.salted = salted;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Cashew cashew = this;
                Cashew cashew1 = (Cashew) obj;
                if (cashew1.quality.equals(cashew1.quality) && cashew1.weight==cashew1.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 16;
    }

    @Override
    public String toString() {
        return "[quality=" + quality + ", weight=" + weight + "g, salted=" + salted + "]";
    }
}
