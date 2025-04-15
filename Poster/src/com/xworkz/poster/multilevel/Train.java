package com.xworkz.poster.multilevel;

public class Train extends Bus {

    public Train(String brand, int cost) {
        super(brand, cost);
    }

    public void travelLongDistance() {
        System.out.println("Train travels long distances quickly");
    }

    public static void main(String[] args) {
        Train train = new Train("Hero Honda",100000 );
        System.out.println("Brand: " + train.brand + ", Type: " + train.cost);
        train.ride();
        train.carryPassengers();
        train.travelLongDistance();
    }
}