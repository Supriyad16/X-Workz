package com.xworkz.task.today;

public class Ring {
    private String metal;
    private double size;
    private boolean hasStone;

    public Ring(String metal, double size, boolean hasStone) {
        this.metal = metal;
        this.size = size;
        this.hasStone = hasStone;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Ring ring = this;
                Ring ring1 = (Ring) obj;
                if (ring1.metal.equals(ring.metal) && ring1.size==ring.size) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 70;
    }

    @Override
    public String toString() {
        return "[metal=" + metal + ", size=" + size + ", hasStone=" + hasStone + "]";
    }
}
