package com.xworkz.fest.work;

class Principal extends Head {
    Principal() {
        super();
        System.out.println("Principal class");
    }

    @Override
    public void leadsOrganization() {
        System.out.println("The Principal leads an organization or institution.");
    }

    @Override
    public void makesDecisions() {
        System.out.println("The Principal is responsible for making important decisions.");
    }

    @Override
    public void managesOperations() {
        System.out.println("The Principal manages daily operations and activities.");
    }

    @Override
    public void representsAuthority() {
        System.out.println("The Principal represents authority in an organization.");
    }

    @Override
    public void ensuresDiscipline() {
        System.out.println("The Principal ensures discipline and order.");
    }
}