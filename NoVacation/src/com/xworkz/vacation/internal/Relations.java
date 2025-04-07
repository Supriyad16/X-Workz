package com.xworkz.vacation.internal;

public class Relations extends Persons{

    public void connection(Family family){

        family.bonding();

        if(family instanceof Persons){

            Persons persons = (Persons) family;
            persons.bonding();
            persons.support();
            persons.surname();
            persons.traditions();
            persons.values();
            persons.emotions();
        }
    }

}
