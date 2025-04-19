package com.xworkz.task.today;

public class Band {

    private String material;
    private String usage;
    private double price;

    public Band(String material, String usage, double price) {
        this.material = material;
        this.usage = usage;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Band band = this;
                Band band1 = (Band) obj;
                if (band1.material.equals(band.material) && band1.usage.equals(band.usage) ){
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 7;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", usage=" + usage + ", price=" + price + "]";
    }
}
