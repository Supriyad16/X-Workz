package com.xworkz.task.today;

public class WireRunner {

    public static void main(String[] args) {
        Wire wire = new Wire("Copper", 10, true);
        System.out.println("Wire " + wire.toString());

        int code = wire.hashCode();
        String value="types";
        System.out.println("RGB:" + wire.hashCode());
        System.out.println("RGB:" + value.hashCode());

        Wire wire1 = new Wire("Silver", 15, false);
        boolean equal= wire1.equals(wire1);
        System.out.println("equal :"+ equal);
    }
}
