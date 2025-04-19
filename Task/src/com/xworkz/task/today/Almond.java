package com.xworkz.task.today;

public class Almond {
    private String origin;
    private double weight;
    private boolean isRoasted;

    public Almond(String origin, double weight, boolean isRoasted) {
        this.origin = origin;
        this.weight = weight;
        this.isRoasted = isRoasted;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Almond almond = this;
                Almond almond1 = (Almond) obj;
                if (almond1.origin.equals(almond.origin) && almond1.weight==almond.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }


    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public String toString() {
        return "[origin=" + origin + ", weight=" + weight + "g, isRoasted=" + isRoasted + "]";
    }
}
