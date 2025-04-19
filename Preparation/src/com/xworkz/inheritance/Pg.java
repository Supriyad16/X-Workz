package com.xworkz.inheritance;

public class Pg extends Hostel{

    Pg() {
        System.out.println("Hello pg");
    }

    public void rent(){
        System.out.println("pay rent monthly");
    }

    public static void main(String[] args) {
        Pg pg = new Pg();
    }
}