package com.xworkz.task.today;

public class ChairRunner {

    public static void main(String[] args) {
        Chair chair = new Chair("Wood", "Brown", 3.5);
        System.out.println("Chair " + chair.toString());

        int code = chair.hashCode();
        String value="madeOf";
        System.out.println("Platic:" + chair.hashCode());
        System.out.println("Plastic:" + value.hashCode());
    }
}
