package com.xworkz.fest.work;

public class FamilyRunner {

    public static void main(String[] args) {

        Family family = new Persons();

        family.bonding();
        family.support();
        family.surname();
        family.traditions();
        family.values();

        Persons persons = new Persons();

        persons.education();
        persons.hobbies();
        persons.profession();
        persons.responsibility();
        persons.socialLife();
    }
}
