package com.xworkz.task.today;

public class BusStandRunner {

    public static void main(String[] args) {
        BusStand busstand = new BusStand("Majestic", 15, true);
        System.out.println("BusStand " + busstand.toString());
        System.out.println("BusStand " + busstand.hashCode());

        int code = busstand.hashCode();
        String value="stop";
        System.out.println("Bus:" + busstand.hashCode());
        System.out.println("Bus:" + value.hashCode());

        BusStand busStand1 = new BusStand("Yelahanka", 15, true);
        boolean equal= busStand1.equals(busStand1);
        System.out.println("equal :"+ equal);
    }
}
