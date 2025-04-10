package com.xworkz.task.today;

public class KeyboardRunner {

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("QWERTY", true, "Dell");
        System.out.println("Keyboard " + keyboard.toString());

        int code = keyboard.hashCode();
        String value="type";
        System.out.println("Computer:" + keyboard.hashCode());
        System.out.println("Computer:" + value.hashCode());
    }
}
