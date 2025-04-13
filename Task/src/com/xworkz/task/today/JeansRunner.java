package com.xworkz.task.today;

public class JeansRunner {
    public static void main(String[] args) {
        Jeans jeans = new Jeans("Cargo", "Nike", true);
        System.out.println("Jeans " + jeans.toString());

        int code = jeans.hashCode();
        String value="jacket";
        System.out.println("Look Cool:" + jeans.hashCode());
        System.out.println("Look Cool:" + value.hashCode());

        Jeans jeans1 = new Jeans("", "Zudio", true);
        boolean equal= jeans1.equals(jeans1);
        System.out.println("equal :"+ equal);
    }
}
