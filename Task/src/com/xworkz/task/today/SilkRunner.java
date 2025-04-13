package com.xworkz.task.today;

public class SilkRunner {
    public static void main(String[] args) {
        Silk silk = new Silk("Indian", "Kanceepuram", true);
        System.out.println("Silk " + silk.toString());

        int code = silk.hashCode();
        String value="cloth";
        System.out.println("Saree:" + silk.hashCode());
        System.out.println("Saree:" + value.hashCode());

        Silk silk1 = new Silk("Indian", "Mysore", true);
        boolean equal= silk1.equals(silk1);
        System.out.println("equal :"+ equal);
    }
}
