package com.xworkz.task.today;

public class BandRunner {

    public static void main(String[] args) {
        Band band = new Band("Elastic", "Hair", 50);
        System.out.println("Band " + band.toString());


        int code = band.hashCode();
        String value="hair";
        System.out.println("Hair:" + band.hashCode());
        System.out.println("Hair:" + value.hashCode());

        Band band1 = new Band("Rubber", "Hand", 20);
        boolean equal= band1.equals(band1);
        System.out.println("equal :"+ equal);
    }
}
