package xworkz.Friday;

public class Runner {
    public static void main(String[] args) {
        Country country = new Country();
        PrimeMinister primeMinister = new PrimeMinister(country);
        country.India();
        Minister minister = new Minister();
        minister.help();

    }
}
