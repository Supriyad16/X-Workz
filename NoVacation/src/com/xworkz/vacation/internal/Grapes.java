package com.xworkz.vacation.internal;

public class Grapes extends Mango{

    public void tasty(Fruit fruit){

        fruit.seasonal();

        if(fruit instanceof Mango){
            Mango mango = (Mango) fruit;
            mango.color();
            mango.grow();
            mango.seasonal();
            mango.taste();
            mango.vitamins();
        }
    }
}
