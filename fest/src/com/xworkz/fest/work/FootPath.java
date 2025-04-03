package com.xworkz.fest.work;

class Footpath extends Road {
    Footpath() {
        super();
        System.out.println("Footpath class");
    }

    public void usedByPedestrians() {
        System.out.println("Footpaths are mainly used by pedestrians.");
    }

    public void provideSafety() {
        System.out.println("Footpaths provide safety by separating pedestrians from vehicles.");
    }

    public void madeOfConcrete() {
        System.out.println("Footpaths are usually made of concrete or stone slabs.");
    }

    public void haveStreetVendors() {
        System.out.println("Footpaths often have street vendors selling goods.");
    }

    public void foundAlongRoads() {
        System.out.println("Footpaths are commonly found along roads for walking convenience.");
    }
}