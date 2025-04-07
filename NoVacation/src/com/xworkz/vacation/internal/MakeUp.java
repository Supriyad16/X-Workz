package com.xworkz.vacation.internal;

public class MakeUp extends Cosmetics{

    public void use(Bag bag){
        bag.openBag();

        if(bag instanceof Cosmetics){

            Cosmetics cosmetics = (Cosmetics) bag;
            cosmetics.adjustStrap();
            cosmetics.carryItems();
            cosmetics.closeBag();
            cosmetics.openBag();
            cosmetics.storage();
            cosmetics.checkCapacity();
        }
    }
}
