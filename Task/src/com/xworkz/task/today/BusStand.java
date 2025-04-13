package com.xworkz.task.today;

public class BusStand {

    private String name;
    private int platforms;
    private boolean hasParking;

    public BusStand(String name, int platforms, boolean hasParking) {
        this.name = name;
        this.platforms = platforms;
        this.hasParking = hasParking;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");

            if (obj instanceof Tshirt) {

                System.out.println("reference is same");

                BusStand busStand = this;
                BusStand busStand1 = (BusStand) obj;
                if (busStand1.name.equals(busStand1.name) && busStand1.platforms==busStand1.platforms) {
                    System.out.println("Both aare same");
                    return true;
                }

            }

        }
        return false;
    }


    @Override
    public int hashCode() {
        return 15;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", platforms=" + platforms + ", hasParking=" + hasParking + "]";
    }
}
