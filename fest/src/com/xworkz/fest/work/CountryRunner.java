package com.xworkz.fest.work;

public class CountryRunner {

    public static void main(String[] args) {

        Country country = new PrimeMinister();

        country.independenceYear();
        country.name();
        country.currency();
        country.population();
        country.nationalAnthem();

        PrimeMinister primeMinister = new PrimeMinister();

        primeMinister.leaderName();
        primeMinister.policies();
        primeMinister.termYears();
        primeMinister.work();
        primeMinister.responsibilities();

    }
}
