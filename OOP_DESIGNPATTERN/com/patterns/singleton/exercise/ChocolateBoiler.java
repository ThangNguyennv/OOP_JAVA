package com.patterns.singleton.exercise;

import java.util.ArrayList;
import java.util.List;

public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;
    private boolean empty;
    private boolean boiled;
    private List<Ingredient> ingredients;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        ingredients = new ArrayList<>();
    }
    
    private class Ingredient {
        private String nameIngredient;
        private int quantity;

        public Ingredient(String nameIngredient, int quantity) {
            this.nameIngredient = nameIngredient;
            this.quantity = quantity;
        }
    }

    private void addIngredient(String nameIngredient, int quantity) {
        Ingredient ingredient = new Ingredient(nameIngredient, quantity);
        ingredients.add(ingredient);
        System.out.println("Added: " + nameIngredient + ", quantity: " + quantity + " to the boiler");
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        } else {
            System.out.println("Returning instance of Chocolate Boiler");
        }  
        return uniqueInstance;
    }

    private void addMilkAndChocolate() {
        addIngredient("milk", 200);
        addIngredient("chocolate", 300);
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
            addMilkAndChocolate();
            System.out.println("Boiler filled with a milk/chocolate mixture");
        } 
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
            System.out.println("Drained the boiled milk and chocolate");
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
            System.out.println("Brought the contents to a boil");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
