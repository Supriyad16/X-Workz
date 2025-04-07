package com.xworkz.vacation.internal;

public class ButterRunner {
    public static void main(String[] args) {

        Butter butter = new Ghee();
        butter.madeFromMilk();
        butter.cooking();
        butter.texture();
        butter.fat();
        butter.flavour();

        System.out.println("----");

        Ghee ghee = new Ghee();
        ghee.madeFromMilk();
        ghee.cooking();
        ghee.texture();
        ghee.fat();
        ghee.flavour();

        System.out.println("----");

        Sweets sweets = new Sweets();
        sweets.fat();
        sweets.cooking();
        sweets.flavour();
        sweets.pure();
        sweets.texture();
        sweets.madeFromMilk();
    }
}