package com.xworkz.poster.hierarchical;

public class Digital extends Archive {
    void encrypt() {
        System.out.println("Encrypting digital files");
    }

    public static void main(String[] args) {
        Digital da = new Digital();
        da.store();
        da.encrypt();
    }
}

