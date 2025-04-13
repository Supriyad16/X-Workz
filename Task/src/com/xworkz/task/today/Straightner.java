package com.xworkz.task.today;

public class Straightner {
    private String plateMaterial;
    private int heatSetting;
    private String brand;

    public Straightner(String plateMaterial, int heatSetting, String brand) {
        this.plateMaterial = plateMaterial;
        this.heatSetting = heatSetting;
        this.brand = brand;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Straightner straightner = this;
                Straightner  straightner1 = (Straightner) obj;
                if (straightner1.plateMaterial.equals(straightner.plateMaterial) && straightner1.heatSetting==straightner.heatSetting) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 83;
    }

    @Override
    public String toString() {
        return "[plateMaterial=" + plateMaterial + ", heatSetting=" + heatSetting + ", brand=" + brand + "]";
    }
}
