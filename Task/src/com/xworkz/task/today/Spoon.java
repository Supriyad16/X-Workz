package com.xworkz.task.today;

public class Spoon {
    private String size;
    private String material;
    private boolean isDisposable;

    public Spoon(String size, String material, boolean isDisposable) {
        this.size = size;
        this.material = material;
        this.isDisposable = isDisposable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Spoon spoon = this;
                Spoon spoon1 = (Spoon) obj;
                if (spoon1.size==(spoon.size) && spoon1.material==spoon.material) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 82;
    }

    @Override
    public String toString() {
        return "[size=" + size + ", material=" + material + ", isDisposable=" + isDisposable + "]";
    }
}
