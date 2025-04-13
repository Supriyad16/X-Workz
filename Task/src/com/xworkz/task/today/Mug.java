package com.xworkz.task.today;

public class Mug {
    private String color;
    private String material;
    private double volume;

    public Mug(String color, String material, double volume) {
        this.color = color;
        this.material = material;
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Mug mug = this;
                Mug mug1 = (Mug) obj;
                if (mug1.color.equals(mug.color) && mug1.volume==mug.volume) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 54;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", material=" + material + ", volume=" + volume + "ml]";
    }
}
