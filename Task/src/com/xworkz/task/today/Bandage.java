package com.xworkz.task.today;

public class Bandage {

    private String size;
    private String material;
    private boolean isSterile;

    public Bandage(String size, String material, boolean isSterile) {
        this.size = size;
        this.material = material;
        this.isSterile = isSterile;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Bandage bandage = this;
                Bandage bandage1 = (Bandage) obj;
                if (bandage1.size.equals(bandage.size) && bandage1.material.equals(bandage.material) ){
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 8;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", material=" + material + ", isSterile=" + isSterile + "]";
    }
}
