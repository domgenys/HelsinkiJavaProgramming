
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Genys.D
 */
public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }

    public boolean cookingTimeAtMost(int max) {
        return this.cookingTime <= max;
    }

    public boolean nameContains(String searchedFor) {
        return this.name.contains(searchedFor);
    }

    public boolean containsIngredient(String ingredient) {
        return this.ingredients.contains(ingredient);
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + cookingTime;
    }

}
