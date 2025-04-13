package com.xworkz.task.today;

public class MotherboardRunner {

    public static void main(String[] args) {
        Motherboard motherboard = new Motherboard("Asus Prime", "LGA1200", 4);
        System.out.println("Motherboard " + motherboard.toString());

        int code = motherboard.hashCode();
        String value="inside";
        System.out.println("Mother of computer:" + motherboard.hashCode());
        System.out.println("Mother of computer:" + value.hashCode());

        Motherboard motherboard1 = new Motherboard("ATX", "BGA", 3);
        boolean equal= motherboard1.equals(motherboard1);
        System.out.println("equal :"+ equal);
    }
}
