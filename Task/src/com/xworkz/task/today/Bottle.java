package com.xworkz.task.today;

public class Bottle {
    private String brand;
    private double capacity;
    private boolean isReusable;

    public Bottle(String brand, double capacity, boolean isReusable) {
        this.brand = brand;
        this.capacity = capacity;
        this.isReusable = isReusable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Bottle bottle = this;
                Bottle bottle1 = (Bottle) obj;
                if (bottle1.capacity==(bottle.capacity) && bottle1.brand==bottle.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 12;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", capacity=" + capacity + "L, isReusable=" + isReusable + "]";
    }
}
