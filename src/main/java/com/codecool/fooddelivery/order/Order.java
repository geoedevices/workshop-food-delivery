package com.codecool.fooddelivery.order;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<Food> ITEMS = new ArrayList<>();
    private final LocalDate ORDERCREATEDDATE;

    public Order() {
        this.ORDERCREATEDDATE = LocalDate.now();
    }

    public List<Food> getItems() {
        return ITEMS;
    }

    public void addItem(Food itemToAdd) {
        ITEMS.add(itemToAdd);
    }

    public LocalDate getOrderCreated() {
        return ORDERCREATEDDATE;
    }

}
