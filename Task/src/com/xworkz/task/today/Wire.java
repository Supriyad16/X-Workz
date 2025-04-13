package com.xworkz.task.today;

public class Wire {

    private String material;
    private int length;
    private boolean isInsulated;

    public Wire(String material, int length, boolean isInsulated) {
        this.material = material;
        this.length = length;
        this.isInsulated = isInsulated;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Wire wire = this;
                Wire wire1 = (Wire) obj;
                if (wire1.material.equals(wire1.material) && wire1.length==wire1.length) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 99;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + "m, isInsulated=" + isInsulated + "]";
    }
}
