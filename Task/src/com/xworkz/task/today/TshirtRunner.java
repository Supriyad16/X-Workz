package com.xworkz.task.today;

public class TshirtRunner {

    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt();
        tshirt1.setBrand("X-Workz");
        tshirt1.setColor("Black");
        tshirt1.setSize(32);

        Tshirt tshirt2 = new Tshirt();
        tshirt2.setBrand("X-Workz");
        tshirt2.setColor("Blue");
        tshirt2.setSize(32);

        Tshirt tshirt3 = new Tshirt();
        tshirt3.setBrand("Puma");
        tshirt3.setColor("Blue");
        tshirt3.setSize(32);


        Towel towel=new Towel("Red","M",true);
        boolean equal= tshirt1.equals(tshirt2); //this == tshirt1,obj==thisrt2
        System.out.println("equal :"+ equal);

    }
}
