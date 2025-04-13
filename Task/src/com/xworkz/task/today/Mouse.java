package com.xworkz.task.today;

public class Mouse {

    private String brand;
    private String type;
    private double price;

    public Mouse(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Mouse mouse = this;
                Mouse mouse1 = (Mouse) obj;
                if (mouse1.brand.equals(mouse.brand) && mouse1.price==mouse.price) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 53;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", type=" + type + ", price=" + price + "]";
    }
}
