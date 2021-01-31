/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Jesus Torres
 */
public class RecipeList {
    
    private ArrayList <Recipe> recipes;
    
    public RecipeList() {
        recipes = new ArrayList<>();
    }
    
    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void printRecipeList() {
        
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void printRecipeByName(String word) {
        
        if (recipes.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (Recipe recipe: recipes) {
                if (recipe.getName().toLowerCase().contains(word.toLowerCase())) {
                System.out.println(recipe);
            }
        }
        }
        
        
    }
    
    public void printByCookingTime(int cookingTime) {
        
        if (recipes.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (Recipe recipe : recipes) {
                if (recipe.getCookingTime() <= cookingTime) {
                System.out.println(recipe);
                }
            }
        } 
    }
    
    public void printByIngredient(String ingredient) {
        
        if (recipes.isEmpty()) {
            System.out.println("Not found");
        } else {
            for (Recipe recipe : recipes) {
                if (recipe.getIngredients().contains(ingredient)) {
                    System.out.println(recipe);
                } 
            }
        }
    }
}
