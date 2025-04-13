package com.xworkz.task.today;

public class BandageRunner {

    public static void main(String[] args) {
        Bandage bandage = new Bandage("Medium", "Cotton", true);
        System.out.println("Bandage " + bandage.toString());


        int code = bandage.hashCode();
        String value="medicine";
        System.out.println("Plaster:" + bandage.hashCode());
        System.out.println("Plaster:" + value.hashCode());

        Bandage bandage1 = new Bandage("Small", "Synthetic", false);
        boolean equal= bandage1.equals(bandage1);
        System.out.println("equal :"+ equal);

    }
}
