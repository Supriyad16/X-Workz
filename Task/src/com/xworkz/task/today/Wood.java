package com.xworkz.task.today;

public class Wood {

    private String type;
    private double weight;
    private String color;

    public Wood(String type, double weight, String color) {
        this.type = type;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Wood wood = this;
                Wood wood1 = (Wood) obj;
                if (wood1.type.equals(wood.type) && wood1.weight==wood.weight) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", weight=" + weight + "kg, color=" + color + "]";
    }
}