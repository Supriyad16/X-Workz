package com.xworkz.vacation.internal;

public class FamilyRunner {

    public static void main(String[] args) {

        Family family = new Persons();
        family.bonding();
        family.support();
        family.surname();
        family.traditions();
        family.values();

        System.out.println("----");

        Persons persons = new Persons();
        persons.bonding();
        persons.support();
        persons.surname();
        persons.traditions();
        persons.values();

        System.out.println("----");

        Relations relations = new Relations();
        relations.bonding();
        relations.support();
        relations.surname();
        relations.traditions();
        relations.values();
        relations.emotions();
    }
}
