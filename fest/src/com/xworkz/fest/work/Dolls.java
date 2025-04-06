package com.xworkz.fest.work;

class Dolls extends Toys {
    Dolls() {
        super();
        System.out.println("Dolls class");
    }

    @Override
    public void entertainment() {
        System.out.println("Dolls provide entertainment for children.");
    }

    @Override
    public void differentMaterials() {
        System.out.println("Dolls can be made of plastic, wood, or fabric.");
    }

    @Override
    public void variousTypes() {
        System.out.println("Dolls come in various types like action figures, puzzles, and stuffed animals.");
    }

    @Override
    public void improveCreativity() {
        System.out.println("Playing with dolls can improve children's creativity and imagination.");
    }

    @Override
    public void learning() {
        System.out.println("Many dolls are designed for educational purposes.");
    }
}