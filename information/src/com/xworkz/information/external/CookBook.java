package com.xworkz.information.external;

import com.xworkz.information.internal.Recipe;

public class CookBook {

    private Recipe recipe;

    public CookBook(Recipe recipe) {
        this.recipe = recipe;
        System.out.println("Arg constructor of CookBook");
    }

    public void displayRecipe() {
        System.out.println("Displaying recipe...");
        if (this.recipe != null) {
            this.recipe.prepare();
        } else {
            System.out.println("Recipe is null");
        }
    }
}
