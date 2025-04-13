package com.xworkz.task.today;

public class Charger {

    private String brand;
    private int wattage;
    private boolean fastCharging;

    public Charger(String brand, int wattage, boolean fastCharging) {
        this.brand = brand;
        this.wattage = wattage;
        this.fastCharging = fastCharging;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Charger charger = this;
                Charger charger1 = (Charger) obj;
                if (charger1.brand.equals(charger1.brand) && charger1.wattage==charger1.wattage) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 18;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", wattage=" + wattage + "W, fastCharging=" + fastCharging + "]";
    }
}
