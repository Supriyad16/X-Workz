package com.xworkz.vacation.internal;

class FreedomFighters extends Freedom {
    FreedomFighters() {
        super(); // Calls the parent class constructor
        System.out.println("FreedomFighters class");
    }

    @Override
    public void definesRights() {
        System.out.println("Defining individual rights is a core aspect of freedom.");
    }

    @Override
    public void equality() {
        System.out.println("Promoting equality by treating everyone fairly and without discrimination.");
    }

    @Override
    public void independence() {
        System.out.println("Achieving independence through the power of freedom.");
    }

    @Override
    public void democracy() {
        System.out.println("Democracy thrives when freedom is upheld for all citizens.");
    }

    @Override
    public void development() {
        System.out.println("Driving development by empowering people through freedom.");
    }
}