package com.xworkz.task.today;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella("Black", true, "Polyester");
        System.out.println("Umbrella " + umbrella.toString());

        int code = umbrella.hashCode();
        String value="sun";
        System.out.println("Radiation:" + umbrella.hashCode());
        System.out.println("Radiation:" + value.hashCode());

        Umbrella umbrella1 = new Umbrella("Blue", false, "Rayon");
        boolean equal= umbrella1.equals(umbrella1);
        System.out.println("equal :"+ equal);
    }
}
