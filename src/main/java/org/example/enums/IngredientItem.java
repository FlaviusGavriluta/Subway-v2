package org.example.enums;

public enum IngredientItem {
    BREAD(3),
    SALAMI(7),
    SALAD(4),
    OLIVES(5);
    private int price;

    IngredientItem(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
