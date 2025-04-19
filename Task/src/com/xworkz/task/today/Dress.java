package com.xworkz.task.today;

public class Dress {

        private String material;
        private String color;
        private double price;

        public Dress(String material, String color, double price) {
            this.material = material;
            this.color = color;
            this.price = price;
        }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Dress dress = this;
                Dress dress1 = (Dress) obj;
                if (dress1.material.equals(dress.material) && dress1.color.equals(dress.color)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 28;
    }

    @Override
        public String toString() {
            return "[material=" + material + ", color=" + color + ", price=" + price + "]";
        }
    }



