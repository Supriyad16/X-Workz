package com.xworkz.task.today;

public class Jeans {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Jeans(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Jeans jeans = this;
                Jeans jeans1 = (Jeans) obj;
                if (jeans1.type.equals(jeans.type) && jeans1.brand==jeans.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 40;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}