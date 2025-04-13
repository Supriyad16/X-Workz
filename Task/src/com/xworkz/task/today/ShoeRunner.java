package com.xworkz.task.today;

public class ShoeRunner {

    public static void main(String[] args) {
        Shoe shoe = new Shoe("Nike", 9, "Black");
        System.out.println("Shoe " + shoe.toString());

        int code = shoe.hashCode();
        String value="sports";
        System.out.println("Volley Ball:" + shoe.hashCode());
        System.out.println("Volley Ball:" + value.hashCode());

        Shoe shoe1 = new Shoe("Puma", 4, "White");
        boolean equal= shoe1.equals(shoe1);
        System.out.println("equal :"+ equal);
    }
}
