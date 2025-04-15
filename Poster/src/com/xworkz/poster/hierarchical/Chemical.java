package com.xworkz.poster.hierarchical;

public class Chemical extends Lab {
    void mixChemicals() {
        System.out.println("Mixing chemicals in the lab");
    }

    public static void main(String[] args) {
        Chemical cl = new Chemical();
        cl.sanitize();
        cl.mixChemicals();
    }
}
