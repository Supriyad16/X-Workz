package com.xworkz.task.today;

public class Radio {

    private String brand;
    private boolean isDigital;
    private double frequencyRange;

    public Radio(String brand, boolean isDigital, double frequencyRange) {
        this.brand = brand;
        this.isDigital = isDigital;
        this.frequencyRange = frequencyRange;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Radio radio = this;
                Radio radio1 = (Radio) obj;
                if (radio1.brand.equals(radio.brand) && radio1.isDigital==radio.isDigital) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 68;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", isDigital=" + isDigital + ", frequencyRange=" + frequencyRange + "MHz]";
    }
}
