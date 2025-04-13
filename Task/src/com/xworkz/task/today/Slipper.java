package com.xworkz.task.today;

public class Slipper {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Slipper(String type, String brand, boolean isAvailable) {
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

                Slipper slipper = this;
                Slipper slipper1 = (Slipper) obj;
                if (slipper1.type==(slipper1.type) && slipper1.brand==slipper1.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }
    @Override
    public int hashCode() {
        return 79;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
