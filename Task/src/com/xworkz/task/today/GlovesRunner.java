package com.xworkz.task.today;

public class GlovesRunner {

    public static void main(String[] args) {
        Gloves gloves = new Gloves("Latex", "Medium", true);
        System.out.println("Gloves " + gloves.toString());

        int code = gloves.hashCode();
        String value="hands";
        System.out.println("Rubber:" + gloves.hashCode());
        System.out.println("Rubber:" + value.hashCode());
    }
}
