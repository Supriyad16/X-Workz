package com.xworkz.task.today;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven = new Oven(28, true, "IFB");
        System.out.println("Oven " + oven.toString());

        int code = oven.hashCode();
        String value="bake";
        System.out.println("Cakes:" + oven.hashCode());
        System.out.println("Cakes:" + value.hashCode());
    }
}
