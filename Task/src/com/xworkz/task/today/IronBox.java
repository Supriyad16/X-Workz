package com.xworkz.task.today;

public class IronBox {
    private String brand;
    private int power;
    private boolean isSteam;

    public IronBox(String brand, int power, boolean isSteam) {
        this.brand = brand;
        this.power = power;
        this.isSteam = isSteam;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                IronBox ironBox = this;
                IronBox ironBox1 = (IronBox) obj;
                if (ironBox1.brand.equals(ironBox1.brand) && ironBox1.power==ironBox1.power) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 38;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", power=" + power + "W, isSteam=" + isSteam + "]";
    }
}
