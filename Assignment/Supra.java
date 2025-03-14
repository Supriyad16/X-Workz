class Supra {
    static void carModel() { System.out.println("Toyota Supra is a sports car."); }
    static void engine() { System.out.println("Supra has a 3.0L turbocharged engine."); }
    static void topSpeed() { System.out.println("Supra's top speed is 250 km/h."); }
    static void acceleration() { System.out.println("Supra accelerates from 0-100 km/h in 4 seconds."); }
    static void price() { System.out.println("Supra costs around $50,000."); }

    static void callGlobeMethods() {
        Globe.continents();
        Globe.oceans();
        Globe.equator();
        Globe.population();
        Globe.countries();
    }
}