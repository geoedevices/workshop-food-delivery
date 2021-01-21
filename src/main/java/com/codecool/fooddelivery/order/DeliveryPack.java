package com.codecool.fooddelivery.order;

import java.util.ArrayList;
import java.util.List;

public class DeliveryPack {

    private final List<Order> ORDERS = new ArrayList<>();

    public List<Order> getOrders() {
        return ORDERS;
    }

    public void addOrder(Order orderToAdd) {
        ORDERS.add(orderToAdd);
    }
}
