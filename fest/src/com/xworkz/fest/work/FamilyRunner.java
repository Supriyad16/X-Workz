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
        persons.bonding();
        persons.support();
        persons.surname();
        persons.traditions();
        persons.values();
    }
}
