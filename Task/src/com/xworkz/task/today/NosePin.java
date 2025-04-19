package com.xworkz.task.today;

public class NosePin {
    private String material;
    private boolean isStudded;
    private String shape;

    public NosePin(String material, boolean isStudded, String shape) {
        this.material = material;
        this.isStudded = isStudded;
        this.shape = shape;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                NosePin nosePin = this;
                NosePin nosePin1 = (NosePin) obj;
                if (nosePin1.material.equals(nosePin.material) && nosePin1.shape.equals(nosePin.shape)) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 57;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", isStudded=" + isStudded + ", shape=" + shape + "]";
    }
}
