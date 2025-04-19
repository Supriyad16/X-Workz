package com.xworkz.task.today;

public class Trunk {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Trunk(String type, String brand, boolean isAvailable) {
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

                Trunk trunk = this;
                Trunk trunk1 = (Trunk) obj;
                if (trunk1.type.equals(trunk.type) && trunk1.brand==trunk.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 95;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
