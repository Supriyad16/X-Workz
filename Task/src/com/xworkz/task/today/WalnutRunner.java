package com.xworkz.task.today;

public class WalnutRunner {
    public static void main(String[] args) {
        Walnut walnut = new Walnut("Chandler", false, 150);
        System.out.println("Walnut " + walnut.toString());

        int code = walnut.hashCode();
        String value="fruits";
        System.out.println("Health:" + walnut.hashCode());
        System.out.println("Health:" + value.hashCode());

        Walnut walnut1 = new Walnut("Egyptian", true, 250);
        boolean equal= walnut1.equals(walnut1);
        System.out.println("equal :"+ equal);
    }
}
