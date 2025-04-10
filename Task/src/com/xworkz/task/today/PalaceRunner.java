package com.xworkz.task.today;

public class PalaceRunner {
    public static void main(String[] args) {
        Palace palace = new Palace("Mysore Palace", 110, "Mysore");
        System.out.println("Palace " + palace.toString());

        int code = palace.hashCode();
        String value="dynasty";
        System.out.println("Mysore:" + palace.hashCode());
        System.out.println("Mysore:" + value.hashCode());
    }
}
