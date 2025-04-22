package com.xworkz.information.internal;

public class RecipeImp implements Recipe {

    public RecipeImp() {
        System.out.println("No-arg constructor of RecipeImp");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing recipe in RecipeImp");
    }
}
