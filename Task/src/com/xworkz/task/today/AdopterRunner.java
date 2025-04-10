package com.xworkz.task.today;

public class AdopterRunner {
    public static void main(String[] args) {
        Adopter adopter = new Adopter("Ac" , "DC", 1500);
        System.out.println("Adopter:" + adopter.toString());

        int code = adopter.hashCode();
        String value="home";
        System.out.println("Adopter:" + adopter.hashCode());
        System.out.println("Adopter:" + value.hashCode());
    }
}