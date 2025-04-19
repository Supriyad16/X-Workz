package com.xworkz.task.today;

public class Umbrella {
    private String color;
    private boolean isFoldable;
    private String material;

    public Umbrella(String color, boolean isFoldable, String material) {
        this.color = color;
        this.isFoldable = isFoldable;
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Umbrella umbrella = this;
                Umbrella umbrella1 = (Umbrella) obj;
                if (umbrella1.color.equals(umbrella.color) && umbrella1.material.equals(umbrella1.material)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 96;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", isFoldable=" + isFoldable + ", material=" + material + "]";
    }
}
