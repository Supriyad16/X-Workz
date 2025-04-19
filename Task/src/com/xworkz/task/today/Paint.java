package com.xworkz.task.today;

public class Paint {

    private String brand;
    private String color;
    private double price;

    public Paint(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Paint paint = this;
                Paint paint1 = (Paint) obj;
                if (paint1.brand.equals(paint.brand) && paint1.price==paint.price) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }


    @Override
    public int hashCode() {
        return 60;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", color=" + color + ", price=" + price + "]";
    }
}
