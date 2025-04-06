package com.xworkz.fest.work;

public class IronMan extends Superhero {

    IronMan() {
        super();
        System.out.println("Iron Man is ready for battle!");
    }

    @Override
    public void fly() {
        System.out.println("IronMan is flying.");
    }

    @Override
    public void fight() {
        System.out.println("IronMan Fights with villains.");
    }

    @Override
    public void superStrength() {
        System.out.println("IronMan uses super strength.");
    }

    @Override
    public void savePeople() {
        System.out.println("IronMan saves innocent people.");
    }

    @Override
    public void disguiseIdentity() {
        System.out.println("IronMan Hides true identity.");
    }
}
