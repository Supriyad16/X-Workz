package com.xworkz.task.today;

public class ApartmentRunner {
    public static void main(String[] args) {
        Apartment apartment = new Apartment("Skyline Towers", 12, "Bangalore");
        System.out.println("Apartment " + apartment.toString());


        int code = apartment.hashCode();
        String value="name";
        System.out.println("Block:" + apartment.hashCode());
        System.out.println("Block:" + value.hashCode());
    }
}
