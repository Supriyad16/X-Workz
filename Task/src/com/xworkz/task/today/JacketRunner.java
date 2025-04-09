package com.xworkz.task.today;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("DefaultType", "DefaultBrand", true);
        System.out.println("Jacket " + jacket.toString());
    }
}
