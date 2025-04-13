package com.xworkz.task.today;

public class Motherboard {

    private String model;
    private String socketType;
    private int ramSlots;

    public Motherboard(String model, String socketType, int ramSlots) {
        this.model = model;
        this.socketType = socketType;
        this.ramSlots = ramSlots;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                Motherboard motherboard = this;
                Motherboard motherboard1 = (Motherboard) obj;
                if (motherboard1.model.equals(motherboard.model) && motherboard1.ramSlots==motherboard.ramSlots) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 52;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", socketType=" + socketType + ", ramSlots=" + ramSlots + "]";
    }
}
