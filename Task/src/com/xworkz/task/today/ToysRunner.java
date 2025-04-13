package com.xworkz.task.today;

public class ToysRunner {
    public static void main(String[] args) {
        Toys toy = new Toys("Lego", "5-10", 1200);
        System.out.println("Toy " + toy.toString());

        int code = toy.hashCode();
        String value="play";
        System.out.println("Games:" + toy.hashCode());
        System.out.println("Games:" + value.hashCode());

        Toys toy1 = new Toys("UNO", "15-20", 1000);
        boolean equal= toy1.equals(toy1);
        System.out.println("equal :"+ equal);
    }
}
