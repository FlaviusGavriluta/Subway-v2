package org.example.model;

import org.example.enums.DrinkFlavor;

public class Drink extends OrderedItem {
    private DrinkFlavor drinkFlavor;

    public Drink(DrinkFlavor drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
    }

    @Override
    public int calculatePrice() {
        return drinkFlavor.getPrice();
    }

    public DrinkFlavor getDrinkFlavor() {
        return drinkFlavor;
    }

    public void setDrinkFlavor(DrinkFlavor drinkFlavor) {
        this.drinkFlavor = drinkFlavor;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkFlavor=" + drinkFlavor +
                ", price=" + calculatePrice() + "$" +
                '}';
    }
}