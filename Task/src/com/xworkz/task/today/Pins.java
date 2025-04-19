package com.xworkz.task.today;

public class Pins {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Pins(String type, String brand, boolean isAvailable) {
        this.type = type;
        this.brand = brand;
        this.isAvailable = isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Pins pins = this;
                Pins pins1 = (Pins) obj;
                if (pins1.type.equals(pins.type) && pins1.brand==pins.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }
    @Override
    public int hashCode() {
        return 62;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
