package com.xworkz.fest.work;

public class ResortRunner {

    public static void main(String[] args) {

        Resort resort = new Vacation();
        resort.bookRoom();
        resort.checkIn();
        resort.checkOut();
        resort.enjoyFacilities();
        resort.orderFood();

        Vacation vacation = new Vacation();
        vacation.bookRoom();
        vacation.checkIn();
        vacation.checkOut();
        vacation.enjoyFacilities();
        vacation.orderFood();
    }
}
