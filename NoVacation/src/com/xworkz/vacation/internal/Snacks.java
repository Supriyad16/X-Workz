package com.xworkz.vacation.internal;

public class Snacks extends Party{

    public void drink(Holiday holiday){

        holiday.enjoy();

        if (holiday instanceof Party){

            Party party = (Party) holiday;
            party.relax();
            party.travel();
            party.spendTimeWithFamily();
            party.enjoy();
            party.happy();
        }
    }
}
