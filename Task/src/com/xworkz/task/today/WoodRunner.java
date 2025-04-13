package com.xworkz.task.today;

public class WoodRunner {

    public static void main(String[] args) {
        Wood wood = new Wood("Teak", 15.2, "Brown");
        System.out.println("Wood " + wood.toString());

        int code = wood.hashCode();
        String value="names";
        System.out.println("Sandal Wood:" + wood.hashCode());
        System.out.println("Sandal Wood:" + value.hashCode());

        Wood wood1 = new Wood("Sandal", 1.5, "Yellow");
        boolean equal= wood1.equals(wood1);
        System.out.println("equal :"+ equal);
    }
}
