package com.xworkz.task.today;

public class Shoe {

    private String brand;
    private int size;
    private String color;

    public Shoe(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Shoe shoe = this;
                Shoe shoe1 = (Shoe) obj;
                if (shoe1.brand.equals(shoe.brand) && shoe1.size==shoe.size) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }
    @Override
    public int hashCode() {
        return 74;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + ", color=" + color + "]";
    }
}
