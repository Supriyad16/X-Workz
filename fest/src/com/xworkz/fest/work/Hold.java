package com.xworkz.fest.work;

class Hold extends Shelf {
    Hold() {
        super();
        System.out.println("Hold class");
    }

    public void supportsWeight() {
        System.out.println("Hold function ensures that the shelf supports weight properly.");
    }

    public void securesItems() {
        System.out.println("Hold keeps items secure and prevents them from falling.");
    }

    public void maintainsBalance() {
        System.out.println("Hold function maintains balance on the shelf.");
    }

    public void dependsOnMaterial() {
        System.out.println("Hold strength depends on the material used for the shelf.");
    }

    public void ensuresDurability() {
        System.out.println("A good hold ensures durability and long-lasting use.");
    }
}