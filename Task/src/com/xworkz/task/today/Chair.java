package com.xworkz.task.today;

public class Chair {

    private String material;
    private String color;
    private double height;

    public Chair(String material, String color, double height) {
        this.material = material;
        this.color = color;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Chair chair = this;
                Chair chair1 = (Chair) obj;
                if (chair1.material.equals(chair.material) && chair1.color==chair.color) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", color=" + color + ", height=" + height + "]";
    }
}
