package com.xworkz.task.today;

public class NecklaceRunner {
    public static void main(String[] args) {
        Necklace necklace = new Necklace("Choker", "Platinum", 25);
        System.out.println("Necklace " + necklace.toString());

        int code = necklace.hashCode();
        String value="neck";
        System.out.println("Choker:" + necklace.hashCode());
        System.out.println("Choker:" + value.hashCode());

        Necklace necklace1 = new Necklace("Garland", "Gold", 10);
        boolean equal= necklace1.equals(necklace1);
        System.out.println("equal :"+ equal);
    }
}
