package com.xworkz.task.today;

public class Rayon {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Rayon(String type, String brand, boolean isAvailable) {
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

                Rayon rayon = this;
                Rayon rayon1 = (Rayon) obj;
                if (rayon1.type.equals(rayon.type) && rayon1.isAvailable==rayon.isAvailable) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 69;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
