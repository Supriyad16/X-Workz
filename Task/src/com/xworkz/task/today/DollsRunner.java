package com.xworkz.task.today;

public class DollsRunner {
    public static void main(String[] args) {
        Dolls doll = new Dolls("Barbie", "Plastic", 30.5);
        System.out.println("Doll " + doll.toString());

        int code = doll.hashCode();
        String value="Barbie";
        System.out.println("Game:" + doll.hashCode());
        System.out.println("Game:" + value.hashCode());

        Dolls dolls = new Dolls("Penguin", "Cooton", 1.5);
        boolean equal= dolls.equals(dolls);
        System.out.println("equal :"+ equal);
    }
}
