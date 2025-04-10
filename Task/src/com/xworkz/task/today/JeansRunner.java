package com.xworkz.task.today;

public class JeansRunner {
    public static void main(String[] args) {
        Jeans jeans = new Jeans("DefaultType", "DefaultBrand", true);
        System.out.println("Jeans " + jeans.toString());

        int code = jeans.hashCode();
        String value="jacket";
        System.out.println("Look Cool:" + jeans.hashCode());
        System.out.println("Look Cool:" + value.hashCode());
    }
}
