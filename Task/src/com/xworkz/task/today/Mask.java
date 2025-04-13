package com.xworkz.task.today;

public class Mask {

    private String type;
    private boolean isReusable;
    private double price;

    public Mask(String type, boolean isReusable, double price) {
        this.type = type;
        this.isReusable = isReusable;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Mask mask = this;
                Mask mask1 = (Mask) obj;
                if (mask1.price==(mask.price) && mask1.type.equals(mask.type)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 51;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", isReusable=" + isReusable + ", price=" + price + "]";
    }
}
