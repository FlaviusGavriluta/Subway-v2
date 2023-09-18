package org.example.model;

import org.example.enums.IngredientItem;

import java.util.List;

public class Sandwich extends OrderedItem {
    private List<IngredientItem> ingredientItems;

    public Sandwich(List<IngredientItem> ingredientItems) {
        this.ingredientItems = ingredientItems;
    }

    @Override
    public int calculatePrice() {
        return ingredientItems.stream().mapToInt(IngredientItem::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Sandwich{" + "ingredientItems=" + ingredientItems + ", price=" + calculatePrice() + "$" + '}';
    }
}