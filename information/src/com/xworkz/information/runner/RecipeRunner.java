package com.xworkz.information.runner;

import com.xworkz.information.internal.Recipe;
import com.xworkz.information.internal.RecipeImp;
import com.xworkz.information.external.CookBook;

public class RecipeRunner {

    public static void main(String[] args) {
        Recipe recipe = new RecipeImp();
        CookBook cookBook = new CookBook(recipe);
        cookBook.displayRecipe();
    }
}
