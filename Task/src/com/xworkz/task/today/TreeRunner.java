package com.xworkz.task.today;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree("DefaultType", "DefaultBrand", true);
        System.out.println("Tree " + tree.toString());

        int code = tree.hashCode();
        String value="fruits";
        System.out.println("Branches:" + tree.hashCode());
        System.out.println("Branches:" + value.hashCode());
    }
}
