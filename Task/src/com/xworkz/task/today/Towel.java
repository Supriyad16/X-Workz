package com.xworkz.task.today;

public class Towel {
    private String color;
    private String size;
    private boolean isCotton;

    public Towel(String color, String size, boolean isCotton) {
        this.color = color;
        this.size = size;
        this.isCotton = isCotton;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Towel towel = this;
                Towel towel1 = (Towel) obj;
                if (towel1.color.equals(towel.color) && towel1.isCotton==towel.isCotton) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
       return 92;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", size=" + size + ", isCotton=" + isCotton + "]";
    }
}
