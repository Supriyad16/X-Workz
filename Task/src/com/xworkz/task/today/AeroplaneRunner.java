package com.xworkz.task.today;

public class AeroplaneRunner {

    public static void main(String[] args) {
        Aeroplane plane = new Aeroplane("Boeing 737", 180, "IndiGo");
        System.out.println("Aeroplane " + plane.toString());


        int code = plane.hashCode();
        String value="Helicopter";
        System.out.println("Wings:" + plane.hashCode());
        System.out.println("Wings:" + value.hashCode());

        Aeroplane plane1 = new Aeroplane("Boeing 666", 100, "IndiGo");
        boolean equal= plane1.equals(plane1);
        System.out.println("equal :"+ equal);

    }
}
