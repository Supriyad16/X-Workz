package com.xworkz.task.today;

public class Plastic {
    private String type;
    private boolean recyclable;
    private String color;

    public Plastic(String type, boolean recyclable, String color) {
        this.type = type;
        this.recyclable = recyclable;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Plastic plastic = this;
                Plastic plastic1 = (Plastic) obj;
                if (plastic1.type.equals(plastic1.type) && plastic1.color==plastic1.color) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 64;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", recyclable=" + recyclable + ", color=" + color + "]";
    }
}
