package com.xworkz.task.today;

public class CurlerRunner {
    public static void main(String[] args) {
        Curler curler = new Curler("Barrel", 180, false);
        System.out.println("Curler " + curler.toString());

        int code = curler.hashCode();
        String value="heatDevice";
        System.out.println("Curls:" + curler.hashCode());
        System.out.println("Curls:" + value.hashCode());
    }
}
