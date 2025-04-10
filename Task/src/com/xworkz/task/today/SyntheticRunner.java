package com.xworkz.task.today;

public class SyntheticRunner {
    public static void main(String[] args) {
        Synthetic synthetic = new Synthetic("DefaultType", "DefaultBrand", true);
        System.out.println("Synthetic " + synthetic.toString());

        int code = synthetic.hashCode();
        String value="clothes";
        System.out.println("Dress Material:" + synthetic.hashCode());
        System.out.println("Dress Material:" + value.hashCode());
    }
}
