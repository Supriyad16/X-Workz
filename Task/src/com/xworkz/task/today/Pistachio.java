package com.xworkz.task.today;

public class Pistachio {
    private String type;
    private boolean opened;
    private double price;

    public Pistachio(String type, boolean opened, double price) {
        this.type = type;
        this.opened = opened;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Pistachio pistachio = this;
                Pistachio pistachio1 = (Pistachio) obj;
                if (pistachio1.type==(pistachio1.type) && pistachio1.price==pistachio1.price) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 63;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", opened=" + opened + ", price=" + price + "]";
    }
}
