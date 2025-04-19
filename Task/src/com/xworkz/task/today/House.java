package com.xworkz.task.today;

public class House {
    private String type;
    private int rooms;
    private boolean hasGarden;

    public House(String type, int rooms, boolean hasGarden) {
        this.type = type;
        this.rooms = rooms;
        this.hasGarden = hasGarden;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                House house = this;
                House house1 = (House) obj;
                if (house1.type.equals(house.type) && house1.rooms==house.rooms) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }

    @Override
    public int hashCode() {
        return 37;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", rooms=" + rooms + ", hasGarden=" + hasGarden + "]";
    }
}
