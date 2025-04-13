package com.xworkz.task.today;

public class SilverRunner {
    public static void main(String[] args) {
        Silver silver = new Silver(92.5, 20, 1800);
        System.out.println("Silver " + silver.toString());

        int code = silver.hashCode();
        String value="ornaments";
        System.out.println("Anklets:" + silver.hashCode());
        System.out.println("Anklets:" + value.hashCode());

        Silver silver1 = new Silver(93.0, 10, 800);
        boolean equal= silver1.equals(silver1);
        System.out.println("equal :"+ equal);
    }
}
