package com.xworkz.poster.hierarchical;

public class Operator extends Theatre {
    void performOperation() {
        System.out.println("Performing an opera");
    }

    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.openCurtain();
        operator.performOperation();
    }
}
