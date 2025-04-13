package com.xworkz.task.today;

public class Jacket {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Jacket(String type, String brand, boolean isAvailable) {
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

                Jacket jacket = this;
                Jacket jacket1 = (Jacket) obj;
                if (jacket1.type.equals(jacket1.type) && jacket1.brand==jacket1.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 39;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
