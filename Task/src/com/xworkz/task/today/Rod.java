package com.xworkz.task.today;

public class Rod {

    private String material;
    private double length;
    private double diameter;

    public Rod(String material, double length, double diameter) {
        this.material = material;
        this.length = length;
        this.diameter = diameter;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Rod rod = this;
                Rod rod1 = (Rod) obj;
                if (rod1.material==(rod1.material) && rod1.length==rod1.length) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 72;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", length=" + length + "m, diameter=" + diameter + "cm]";
    }
}
