package com.xworkz.task.today;

public class MouseRunner {

    public static void main(String[] args) {
        Mouse mouse = new Mouse("Logitech", "Wireless", 899);
        System.out.println("Mouse " + mouse.toString());

        int code = mouse.hashCode();
        String value="move";
        System.out.println("Work:" + mouse.hashCode());
        System.out.println("Work:" + value.hashCode());
    }
}
