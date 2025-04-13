package com.xworkz.task.today;

public class Headphone {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Headphone(String type, String brand, boolean isAvailable) {
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

                Headphone headphone = this;
                Headphone headphone1 = (Headphone) obj;
                if (headphone1.type.equals(headphone1.type) && headphone1.brand==headphone1.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 35;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
