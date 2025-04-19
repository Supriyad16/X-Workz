package com.xworkz.task.today;

public class Television {

    private String brand;
    private int size;
    private boolean isSmart;

    public Television(String brand, int size, boolean isSmart) {
        this.brand = brand;
        this.size = size;
        this.isSmart = isSmart;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Television television = this;
                Television television1 = (Television) obj;
                if (television1.brand.equals(television.brand) && television1.size==television.size) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 89;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + "inch, isSmart=" + isSmart + "]";
    }
}
