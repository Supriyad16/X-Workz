package com.xworkz.task.today;

public class Gloves {

    private String material;
    private String size;
    private boolean isDisposable;

    public Gloves(String material, String size, boolean isDisposable) {
        this.material = material;
        this.size = size;
        this.isDisposable = isDisposable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Gloves gloves = this;
                Gloves gloves1 = (Gloves) obj;
                if (gloves1.material.equals(gloves.material) && gloves1.size.equals(gloves.size) ){
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 32;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", isDisposable=" + isDisposable + "]";
    }
}
