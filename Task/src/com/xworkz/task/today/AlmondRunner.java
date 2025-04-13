package com.xworkz.task.today;

public class AlmondRunner {
    public static void main(String[] args) {
        Almond almond = new Almond("California", 50, true);
        System.out.println("Almond " + almond.toString());


        int code = almond.hashCode();
        String value="seeds";
        System.out.println("DryFruits:" + almond.hashCode());
        System.out.println("DryFruits:" + value.hashCode());

        Almond almond1 = new Almond("India", 100, true);
        boolean equal= almond.equals(almond);
        System.out.println("equal :"+ equal);


    }
}
