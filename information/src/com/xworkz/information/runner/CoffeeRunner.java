package com.xworkz.information.runner;

import com.xworkz.information.internal.Coffee;
import com.xworkz.information.internal.CoffeeImp;
import com.xworkz.information.external.Beverages;

public class CoffeeRunner {

    public static void main(String[] args) {
        Coffee coffee = new CoffeeImp();
        Beverages beverages = new Beverages(coffee);
        beverages.drink();
    }
}
