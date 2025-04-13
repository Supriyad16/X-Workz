package com.xworkz.task.today;

public class MallRunner {

    public static void main(String[] args) {
        Mall mall = new Mall("Phoenix", 200, "Banglore");
        System.out.println("Mall " + mall.toString());

        int code = mall.hashCode();
        String value="big";
        System.out.println("Window Shopping:" + mall.hashCode());
        System.out.println("Window Shopping:" + value.hashCode());

        Mall mall1 = new Mall("Orion", 100, "Bengaluru");
        boolean equal= mall1.equals(mall1);
        System.out.println("equal :"+ equal);
    }
}
