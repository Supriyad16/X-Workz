package com.xworkz.fest.work;

class Party extends Holiday {
    Party() {
        super();
        System.out.println("Party class");
    }

    @Override
    public void relax() {
        System.out.println("Relax the holiday by party");
    }

    @Override
    public void travel() {
        System.out.println("Traveling during holiday.");
    }

    @Override
    public void spendTimeWithFamily() {
        System.out.println("Spending time with family and friends during holiday.");
    }

    @Override
    public void enjoy() {
        System.out.println("Enjoy the holiday.");
    }

    @Override
    public void happy() {
        System.out.println("Happy time with family and friends.");
    }

}