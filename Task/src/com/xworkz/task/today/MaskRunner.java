package com.xworkz.task.today;

public class MaskRunner {

    public static void main(String[] args) {
        Mask mask = new Mask("N95", true, 99);
        System.out.println("Mask " + mask.toString());

        int code = mask.hashCode();
        String value="nose";
        System.out.println("Away fro disease:" + mask.hashCode());
        System.out.println("Away from disease:" + value.hashCode());
    }
}
