package com.xworkz.information.runner;

import com.xworkz.information.internal.Chef;
import com.xworkz.information.internal.ChefImp;
import com.xworkz.information.external.Foodie;

public class ChefRunner {

    public static void main(String[] args) {
        Chef chef = new ChefImp();
        Foodie foodie = new Foodie(chef);
        foodie.eat();
    }
}
