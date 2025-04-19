package com.xworkz.task.today;

public class Hoodie {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Hoodie(String type, String brand, boolean isAvailable) {
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

                Hoodie hoodie = this;
                Hoodie hoodie1 = (Hoodie) obj;
                if (hoodie1.type.equals(hoodie.type) && hoodie1.brand.equals(hoodie.brand) ){
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 36;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
