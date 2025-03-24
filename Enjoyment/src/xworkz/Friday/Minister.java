package xworkz.Friday;

public class Minister {

    public static void help(){

        String  Mname[]= {"Finance", "Health", "Home", "Education"};
        PrimeMinister primeMinister = new PrimeMinister(new Country());

        System.out.println("Ministers in charge: ");
        for (String name : Mname) {
            System.out.println(name);
        }
    }
}
