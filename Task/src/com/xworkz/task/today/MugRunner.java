package com.xworkz.task.today;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug = new Mug("White", "Ceramic", 350);
        System.out.println("Mug " + mug.toString());

        int code = mug.hashCode();
        String value="creamic";
        System.out.println("Drink:" + mug.hashCode());
        System.out.println("Drink:" + value.hashCode());
    }
}
