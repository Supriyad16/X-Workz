package com.xworkz.fest.work;
public class PrimeMinister extends Country {

    PrimeMinister() {
        super();
        System.out.println("This is the Prime Minister");
    }

    @Override
    public void name() {
        System.out.println("Country name: Bharath");
    }

    @Override
    public void population() {
        System.out.println("Population: 1.4B");
    }

    @Override
    public void nationalAnthem() {
        System.out.println("JanaGanaMana is the national anthem of our country.");
    }

    @Override
    public void independenceYear() {
        System.out.println("Independence Year: 1947 of Aug 15");
    }

    @Override
    public void currency() {
        System.out.println("Indian Rupee is the Currency of India.");
    }
}