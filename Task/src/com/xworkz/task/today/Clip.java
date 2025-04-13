package com.xworkz.task.today;

public class Clip {

    private String type;
    private String color;
    private int quantity;

    public Clip(String type, String color, int quantity) {
        this.type = type;
        this.color = color;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Clip clip = this;
                Clip clip1 = (Clip) obj;
                if (clip1.type.equals(clip1.type) && clip1.color==clip1.color) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 21;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", color=" + color + ", quantity=" + quantity + "]";
    }
}
