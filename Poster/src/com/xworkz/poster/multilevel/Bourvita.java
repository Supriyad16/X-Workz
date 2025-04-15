package com.xworkz.poster.multilevel;

public class Bourvita extends Boost{

    public Bourvita(String flavor, int weight) {
        super(flavor, weight);
    }

    public void drinkBourvita() {
        System.out.println("Bouvita gives more strength");
    }

    public static void main(String[] args) {
        Bourvita bourvita = new Bourvita("Chocolate", 500);
        System.out.println("Flavor: "+ bourvita.flavor +","+" Weight: "+bourvita.weight);
        bourvita.drinkBoost();
        bourvita.drinkHorlicks();
        bourvita.drinkBourvita();
    }
}
