package com.xworkz.realworld.examples;

public class Office extends Building{

    public static void main(String[] args) {

        Building building = new Office();
        String name = "Xworkz";
        String area = "Rajajinagar";
        int builtYear = 2018;

        System.out.println("The office " + name +" was built in " + builtYear+ " and is located at " + area);


    }
}
