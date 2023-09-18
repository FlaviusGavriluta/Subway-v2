package org.example.enums;

public enum DrinkFlavor {
    COCA_COLA(5),
    FANTA(4),
    ICETEA(3);
    private int price;

    DrinkFlavor(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
