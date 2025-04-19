package com.xworkz.task.today;

public class Sweets {
    private String name;
    private double weight;
    private boolean isSugarFree;

    public Sweets(String name, double weight, boolean isSugarFree) {
        this.name = name;
        this.weight = weight;
        this.isSugarFree = isSugarFree;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Sweets sweets = this;
                Sweets sweets1 = (Sweets) obj;
                if (sweets1.name.equals(sweets.name) && sweets1.weight==sweets.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 84;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", weight=" + weight + "g, isSugarFree=" + isSugarFree + "]";
    }
}
