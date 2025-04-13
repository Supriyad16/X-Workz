package com.xworkz.task.today;

public class PlasticRunner {
    public static void main(String[] args) {
        Plastic plastic = new Plastic("Polyethylene", true, "Transparent");
        System.out.println("Plastic " + plastic.toString());

        int code = plastic.hashCode();
        String value="harmful";
        System.out.println("Banned:" + plastic.hashCode());
        System.out.println("Banned:" + value.hashCode());

        Plastic plastic1 = new Plastic("Polyethylene Terephthalate ", false, "Transparent");
        boolean equal= plastic1.equals(plastic1);
        System.out.println("equal :"+ equal);
    }
}
