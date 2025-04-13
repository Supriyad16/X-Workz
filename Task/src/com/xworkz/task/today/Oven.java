package com.xworkz.task.today;

public class Oven {
    private int capacity;
    private boolean isMicrowave;
    private String brand;

    public Oven(int capacity, boolean isMicrowave, String brand) {
        this.capacity = capacity;
        this.isMicrowave = isMicrowave;
        this.brand = brand;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Oven oven = this;
                Oven oven1 = (Oven) obj;
                if (oven1.brand.equals(oven.brand) && oven1.capacity==oven1.capacity) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 59;
    }

    @Override
    public String toString() {
        return "[capacity=" + capacity + "L, isMicrowave=" + isMicrowave + ", brand=" + brand + "]";
    }
}
