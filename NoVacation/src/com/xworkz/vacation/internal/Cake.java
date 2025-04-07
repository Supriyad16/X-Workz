package com.xworkz.vacation.internal;

public class Cake extends IceCream{

    public void pastry(Dessert dessert){

        dessert.ingredients();

        if (dessert instanceof IceCream){
            IceCream iceCream = (IceCream) dessert;

            iceCream.enjoy();
            iceCream.flavour();
            iceCream.ingredients();
            iceCream.serve();
            iceCream.taste();
            iceCream.store();

        }
    }
}
