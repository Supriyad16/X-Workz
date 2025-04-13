package com.xworkz.task.today;

public class Wall {

    private String material;
    private double height;
    private String color;

    public Wall(String material, double height, String color) {
        this.material = material;
        this.height = height;
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Wall wall = this;
                Wall wall1 = (Wall) obj;
                if (wall1.material==(wall1.material) && wall1.height==wall1.height) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 97;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", height=" + height + ", color=" + color + "]";
    }
}
