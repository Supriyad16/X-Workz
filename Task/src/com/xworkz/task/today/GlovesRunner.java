package com.xworkz.task.today;

public class GlovesRunner {

    public static void main(String[] args) {
        Gloves gloves = new Gloves("Latex", "M", true);
        System.out.println("Gloves " + gloves.toString());

        int code = gloves.hashCode();
        String value="hands";
        System.out.println("Rubber:" + gloves.hashCode());
        System.out.println("Rubber:" + value.hashCode());

        Gloves gloves1 = new Gloves("Leather", "S", true);
        boolean equal= gloves1.equals(gloves1);
        System.out.println("equal :"+ equal);
    }
}
