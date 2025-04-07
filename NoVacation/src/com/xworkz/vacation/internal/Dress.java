package com.xworkz.vacation.internal;

public class Dress extends  Nylon{

    public void design(Nylon nylon){

        nylon.durable();

        if (nylon instanceof Shirt){
            Shirt shirt = (Shirt) nylon;
            shirt.syntheticFiber();
            shirt.durable();
            shirt.waterResistant();
            shirt.lightweight();
            shirt.waterResistant();
        }
    }
}
