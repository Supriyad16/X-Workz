package com.xworkz.task.today;

public class Toaster {
    private int slots;
    private String brand;
    private boolean hasTimer;

    public Toaster(int slots, String brand, boolean hasTimer) {
        this.slots = slots;
        this.brand = brand;
        this.hasTimer = hasTimer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Toaster toaster = this;
                Toaster toaster1 = (Toaster) obj;
                if (toaster1.brand.equals(toaster.brand) && toaster1.slots==toaster.slots) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 91;
    }

    @Override
    public String toString() {
        return "[slots=" + slots + ", brand=" + brand + ", hasTimer=" + hasTimer + "]";
    }
}
