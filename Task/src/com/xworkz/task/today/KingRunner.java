package com.xworkz.task.today;

public class KingRunner {
    public static void main(String[] args) {
        King king = new King("Ashoka", "Maurya", 45);
        System.out.println("King " + king.toString());

        int code = king.hashCode();
        String value="rule";
        System.out.println("Kingdom:" + king.hashCode());
        System.out.println("Kingdom:" + value.hashCode());

        King King1 = new King("Krishnadevaraya", "Tuluva", 58);
        boolean equal= king.equals(king);
        System.out.println("equal :"+ equal);
    }
}
