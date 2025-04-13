package com.xworkz.task.today;

public class JacketRunner {
    public static void main(String[] args) {
        Jacket jacket = new Jacket("RainCoat", "Nike", true);
        System.out.println("Jacket " + jacket.toString());

        int code = jacket.hashCode();
        String value="rain";
        System.out.println("Wear:" + jacket.hashCode());
        System.out.println("Wear:" + value.hashCode());

        Jacket jacket1 = new Jacket("Hoodie", "Puma", true);
        boolean equal= jacket1.equals(jacket1);
        System.out.println("equal :"+ equal);
    }
}
