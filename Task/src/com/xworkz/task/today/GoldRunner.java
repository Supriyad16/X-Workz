package com.xworkz.task.today;

public class GoldRunner {
    public static void main(String[] args) {
        Gold gold = new Gold(99.9, 10, 55000);
        System.out.println("Gold " + gold.toString());

        int code = gold.hashCode();
        String value="costly";
        System.out.println("Ornaments:" + gold.hashCode());
        System.out.println("Ornaments:" + value.hashCode());

        Gold gold1 = new Gold(90, 15, 100000 );
        boolean equal= gold1.equals(gold1);
        System.out.println("equal :"+ equal);
    }
}
