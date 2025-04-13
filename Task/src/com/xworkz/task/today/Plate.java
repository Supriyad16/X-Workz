package com.xworkz.task.today;

public class Plate {
    private String material;
    private String shape;
    private boolean isMicrowaveSafe;

    public Plate(String material, String shape, boolean isMicrowaveSafe) {
        this.material = material;
        this.shape = shape;
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Plate plate = this;
                Plate plate1 = (Plate) obj;
                if (plate1.material.equals(plate1.material) && plate1.isMicrowaveSafe==plate1.isMicrowaveSafe) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        String value = "X-workz";
        return 66;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", shape=" + shape + ", isMicrowaveSafe=" + isMicrowaveSafe + "]";
    }
}
