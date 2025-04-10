package com.xworkz.task.today;

public class MallRunner {

    public static void main(String[] args) {
        Mall mall = new Mall("Phoenix", 120, "Mumbai");
        System.out.println("Mall " + mall.toString());

        int code = mall.hashCode();
        String value="big";
        System.out.println("Window Shopping:" + mall.hashCode());
        System.out.println("Window Shopping:" + value.hashCode());
    }
}
