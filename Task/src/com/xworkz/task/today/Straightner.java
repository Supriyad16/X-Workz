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
    public String toString() {
        return "[plateMaterial=" + plateMaterial + ", heatSetting=" + heatSetting + ", brand=" + brand + "]";
    }
}
