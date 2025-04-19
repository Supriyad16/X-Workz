package com.xworkz.inheritance;

public class Pillow extends Room{
    @Override
    void bed() {
        System.out.println("jk");
    }

    public static void main(String[] args) {

        Pillow pillow= new Pillow();
        pillow.bed();
    }
}
