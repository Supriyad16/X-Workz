package com.xworkz.vacation.internal;

public class Bangles extends Bracelet{

    public  void wear(Hand hand){

        hand.designs();

        if (hand instanceof Bracelet){

            Bracelet bracelet = (Bracelet) hand;
            bracelet.wear();
            bracelet.style();
            bracelet.gift();
            bracelet.designs();
            bracelet.materials();


        }
    }
}
