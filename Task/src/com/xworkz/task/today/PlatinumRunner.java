package com.xworkz.task.today;

public class PlatinumRunner {
    public static void main(String[] args) {
        Platinum platinum = new Platinum(95.0, 5, 15000);
        System.out.println("Platinum " + platinum.toString());

        int code = platinum.hashCode();
        String value="ornaments";
        System.out.println("Expensive:" + platinum.hashCode());
        System.out.println("Expensive:" + value.hashCode());

        Platinum platinum1 = new Platinum(80.0, 8, 25000);
        boolean equal= platinum1.equals(platinum1);
        System.out.println("equal :"+ equal);
    }
}
