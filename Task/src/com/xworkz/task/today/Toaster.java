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
    public int hashCode() {
        return 91;
    }

    @Override
    public String toString() {
        return "[slots=" + slots + ", brand=" + brand + ", hasTimer=" + hasTimer + "]";
    }
}
