/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Jesus Torres
 */
public class UserInterface {
    
    private RecipeList recipeList;
    private Scanner scanner;
    
    public UserInterface(Scanner scanner, RecipeList recipeList) {
        this.scanner = scanner;
        this.recipeList = recipeList;
    }
    
    public void start() {
        System.out.println("Commands:");
        System.out.println("list - list the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipe by ingredient");
        
        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            }
            
            if (command.equals("list")) {
                System.out.println("\nRecipes:");
                recipeList.printRecipeList();
            }
            
            if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
                System.out.println("\nRecipes:");
                recipeList.printRecipeByName(word);
            }
            
            if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                System.out.println("\nRecipes: ");
                recipeList.printByIngredient(ingredient);
            }
            
            if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int cookingTime = Integer.valueOf(scanner.nextLine());
                System.out.println("\nRecipes: ");
                recipeList.printByCookingTime(cookingTime);
            }
        }
    }
}
