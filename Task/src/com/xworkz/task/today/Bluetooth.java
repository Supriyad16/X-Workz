package com.xworkz.task.today;

public class Bluetooth {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Bluetooth(String type, String brand, boolean isAvailable) {
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

                Bluetooth bluetooth = this;
                Bluetooth bluetooth1 = (Bluetooth) obj;
                if (bluetooth1.type.equals(bluetooth.type) && bluetooth1.brand==bluetooth.brand) {
                    System.out.println("Both aare same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 11;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
