class Atom {
    static void electrons() { System.out.println("An atom has electrons."); }
    static void protons() { System.out.println("An atom has protons."); }
    static void neutrons() { System.out.println("An atom has neutrons."); }
    static void nucleus() { System.out.println("The nucleus contains protons and neutrons."); }
    static void atomicMass() { System.out.println("Atomic mass varies per element."); }

    static void callIcecreamMethods() {
        Icecream.flavor();
        Icecream.price();
        Icecream.toppings();
        Icecream.brand();
        Icecream.temperature();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\n### Lollipop invoking Laptop Methods ###");
        Lollipop.callLaptopMethods();

        System.out.println("\n### ICC invoking MNCCompany Methods ###");
        ICC.callMNCMethods();

        System.out.println("\n### IplCup invoking RCB Methods ###");
        IplCup.callRCBMethods();

        System.out.println("\n### Supra invoking Globe Methods ###");
        Supra.callGlobeMethods();

        System.out.println("\n### Atom invoking Icecream Methods ###");
        Atom.callIcecreamMethods();
    }
}