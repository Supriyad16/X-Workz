package com.xworkz.task.today;

public class AdopterRunner {
    public static void main(String[] args) {
        Adopter adopter = new Adopter("Ac" , "DC", 1500);
        System.out.println("Adopter:" + adopter.toString());

        int code = adopter.hashCode();
        String value="home";
        System.out.println("Adopter:" + adopter.hashCode());
        System.out.println("Adopter:" + value.hashCode());

        Adopter adopter1 = new Adopter("DC", "Ac", 2800);
        System.out.println("Adopter1: "+ adopter1.toString());

        boolean equal= adopter1.equals(adopter1);
        System.out.println("equal :"+ equal);


    }
}