package com.xworkz.task.today;

public class Chip {

    private String type;
    private String manufacturer;
    private double size;

    public Chip(String type, String manufacturer, double size) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.size = size;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Chip chip = this;
                Chip chip1 = (Chip) obj;
                if (chip1.type.equals(chip1.type) && chip1.manufacturer==chip1.manufacturer) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 19;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", manufacturer=" + manufacturer + ", size=" + size + "nm]";
    }
}
