package com.xworkz.task.today;

public class SilkRunner {
    public static void main(String[] args) {
        Silk silk = new Silk("DefaultType", "DefaultBrand", true);
        System.out.println("Silk " + silk.toString());

        int code = silk.hashCode();
        String value="cloth";
        System.out.println("Saree:" + silk.hashCode());
        System.out.println("Saree:" + value.hashCode());
    }
}
