package com.xworkz.realworld.examples;

public class Munnar extends Trip{

    @Override
    public void vacation(){
        System.out.println("Vacation to munnar");
    }

    public static void main(String[] args) {

        Trip trip = new Munnar();
        trip.vacation();

    }

}
