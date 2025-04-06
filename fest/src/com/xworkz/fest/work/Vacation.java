package com.xworkz.fest.work;

public class Vacation extends Resort {

    Vacation() {
        super();
        System.out.println("Enjoy your vacation!");
    }

    @Override
    public void bookRoom() {
        System.out.println("Room has booked");
    }

    @Override
    public void checkIn() {
        System.out.println("Guests have checked in");
    }

    @Override
    public void checkOut() {
        System.out.println("Guests have checked out");
    }

    @Override
    public void orderFood() {
        System.out.println("Food has ordered.");
    }

    @Override
    public void enjoyFacilities() {
        System.out.println("Enjoy the facilities");
    }
}