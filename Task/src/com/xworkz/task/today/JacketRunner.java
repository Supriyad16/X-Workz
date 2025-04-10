package com.xworkz.task.today;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("DefaultType", "DefaultBrand", true);
        System.out.println("Jacket " + jacket.toString());

        int code = jacket.hashCode();
        String value="rain";
        System.out.println("Wear:" + jacket.hashCode());
        System.out.println("Wear:" + value.hashCode());
    }
}
