package org.example;

import org.example.enums.DrinkFlavor;
import org.example.enums.IngredientItem;
import org.example.model.Drink;
import org.example.model.Sandwich;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant subway1 = new Restaurant("Subway_TM");

        Drink drink1 = new Drink(DrinkFlavor.COCA_COLA);
        Drink drink2 = new Drink(DrinkFlavor.FANTA);
        Drink drink3 = new Drink(DrinkFlavor.ICETEA);

        Sandwich salad_sandwich = new Sandwich(List.of(IngredientItem.BREAD, IngredientItem.SALAD));
        Sandwich salami_sandwich = new Sandwich(List.of(IngredientItem.BREAD, IngredientItem.SALAMI));
        Sandwich olives_sandwich3 = new Sandwich(List.of(IngredientItem.BREAD, IngredientItem.OLIVES));

        subway1.addOrder(drink1);
        subway1.addOrder(drink2);
        subway1.addOrder(drink3);
        subway1.addOrder(salad_sandwich);
        subway1.addOrder(salami_sandwich);
        subway1.addOrder(olives_sandwich3);

        System.out.println("A list of the ordered items and their prices: ");
        subway1.getOrderedItems().forEach(System.out::println);

        System.out.println("----------------------");

        System.out.println("Calculating the price of all orders: " + subway1.calculateTotalIncome()+"$");
    }
}