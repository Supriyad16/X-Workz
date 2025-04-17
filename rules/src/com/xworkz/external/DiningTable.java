package com.xworkz.external;

import com.xworkz.rules.Table;

public class DiningTable implements Table {

    @Override
    public void place() {
        System.out.println("Placing dishes on the dining table");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the dining table");
    }

    @Override
    public void move() {
        System.out.println("Moving the dining table");
    }

    @Override
    public void study(){
        System.out.println("study in dining table");
    }

    public static void main(String[] args) {
        DiningTable diningTable = new DiningTable();
        diningTable.place();
        diningTable.clean();
        diningTable.move();
        diningTable.study();
    }
}
