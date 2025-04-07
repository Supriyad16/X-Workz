package com.xworkz.vacation.internal;

public class Sweets extends Ghee{

    public void Sugar(Butter butter){

        butter.flavour();

        if(butter instanceof Ghee){

            Ghee ghee = (Ghee) butter;
            ghee.fat();
            ghee.cooking();
            ghee.flavour();
            ghee.pure();
            ghee.texture();
            ghee.madeFromMilk();
        }
    }
}
