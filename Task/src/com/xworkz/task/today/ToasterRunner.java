package com.xworkz.task.today;

public class ToasterRunner {
    public static void main(String[] args) {
        Toaster toaster = new Toaster(2, "Bajaj", true);
        System.out.println("Toaster " + toaster.toString());

        int code = toaster.hashCode();
        String value="bread";
        System.out.println("Sandwich:" + toaster.hashCode());
        System.out.println("Sandwich:" + value.hashCode());
    }
}
