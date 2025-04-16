package com.xworkz.rules;

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

    public static void main(String[] args) {
        DinnerFork fork = new DinnerFork();
        fork.poke();
        fork.lift();
        fork.wash();
    }
}
