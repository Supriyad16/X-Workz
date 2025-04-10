package com.xworkz.task.today;

public class QueenRunner {
    public static void main(String[] args) {
        Queen queen = new Queen("Elizabeth", "UK", false);
        System.out.println("Queen " + queen.toString());

        int code = queen.hashCode();
        String value="dynasty";
        System.out.println("Decision Maker:" + queen.hashCode());
        System.out.println("Decision Maker:" + value.hashCode());
    }
}
