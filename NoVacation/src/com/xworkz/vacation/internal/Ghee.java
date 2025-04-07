package com.xworkz.vacation.internal;

class Ghee extends Butter {
    Ghee() {
        super();
        System.out.println("Ghee class");
    }

    @Override
    public void madeFromMilk() {
        System.out.println("Butter is made from milk and ghee is made of butter.");
    }

    @Override
    public void cooking() {
        System.out.println("Ghee is commonly used in cooking and baking.");
    }

    @Override
    public void texture() {
        System.out.println("Ghee has a smooth texture.");
    }

    @Override
    public void fat() {
        System.out.println("Ghee is rich in fat and provides energy.");
    }

    @Override
    public void flavour() {
        System.out.println("Ghee enhances the flavor of food.");
    }

    public void pure(){
        System.out.println("Ghee is so pure");
    }
}