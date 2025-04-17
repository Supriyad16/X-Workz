package com.xworkz.external;

import com.xworkz.rules.Fork;

public class DinnerFork implements Fork {

    @Override
    public void poke() {
        System.out.println("Poking food with the dinner fork");
    }

    @Override
    public void lift() {
        System.out.println("Lifting food using the dinner fork");
    }

    @Override
    public void wash() {
        System.out.println("Washing the dinner fork");
    }

    @Override
    public void eat(){
        System.out.println("Eat the food");
    }

    public static void main(String[] args) {
        DinnerFork dinnerFork = new DinnerFork();
        dinnerFork.poke();
        dinnerFork.lift();
        dinnerFork.wash();
        dinnerFork.eat();
    }
}
