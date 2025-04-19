package com.xworkz.task.today;

public class Speaker {

    private String brand;
    private int power;
    private boolean isBluetooth;

    public Speaker(String brand, int power, boolean isBluetooth) {
        this.brand = brand;
        this.power = power;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Speaker speaker = this;
                Speaker speaker1 = (Speaker) obj;
                if (speaker1.brand.equals(speaker.brand) && speaker1.power==speaker.power) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }
    @Override
    public int hashCode() {
        return 81;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", power=" + power + "W, isBluetooth=" + isBluetooth + "]";
    }
}
