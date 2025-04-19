package com.xworkz.task.today;

public class Silk {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Silk(String type, String brand, boolean isAvailable) {
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

                Silk silk = this;
                Silk silk1 = (Silk) obj;
                if (silk1.type.equals(silk.type) && silk1.brand==silk.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 76;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
