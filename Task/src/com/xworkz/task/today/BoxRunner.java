package com.xworkz.task.today;

public class BoxRunner {
    public static void main(String[] args) {
        Box box = new Box("Cardboard", 30, 20);
        System.out.println("Box " + box.toString());
        System.out.println("Box " + box.hashCode());

        int code = box.hashCode();
        String value="tiffin box";
        System.out.println("Lunch:" + box.hashCode());
        System.out.println("Lunch:" + value.hashCode());
    }
}
