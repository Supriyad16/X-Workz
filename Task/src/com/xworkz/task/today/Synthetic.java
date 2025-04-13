package com.xworkz.task.today;

public class Synthetic {
    private String type;
    private String brand;
    private boolean isAvailable;

    public Synthetic(String type, String brand, boolean isAvailable) {
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

                Synthetic synthetic = this;
                Synthetic synthetic1 = (Synthetic) obj;
                if (synthetic1.type.equals(synthetic1.type) && synthetic1.brand==synthetic1.brand) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }
    @Override
    public int hashCode() {
        return 85;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isAvailable=" + isAvailable + "]";
    }
}
