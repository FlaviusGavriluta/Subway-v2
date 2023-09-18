package org.example;

import org.example.model.OrderedItem;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<OrderedItem> orderedItems;

    public Restaurant(String name) {
        this.name = name;
        this.orderedItems = new ArrayList<>();
    }

    public List<OrderedItem> getOrderedItems() {
        return orderedItems;
    }

    public void addOrder(OrderedItem orderedItem) {
        orderedItems.add(orderedItem);
    }

    public int calculateTotalIncome() {
        return orderedItems.stream()
                .mapToInt(OrderedItem::calculatePrice)
                .sum();
    }
}
