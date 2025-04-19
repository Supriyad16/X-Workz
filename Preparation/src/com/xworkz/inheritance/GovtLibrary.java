package com.xworkz.inheritance;

public class GovtLibrary extends Library{
    @Override
    void books(String name) {
        System.out.println(name);
    }
    @Override
    public void read(){
        System.out.println("Read books");
    }

    public static void main(String[] args) {
        GovtLibrary govtLibrary = new GovtLibrary();
        govtLibrary.books("Agatha");
        govtLibrary.read();




    }
}
