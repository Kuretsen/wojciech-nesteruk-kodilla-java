package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class AvailableOrders {
    private Map<String, OrderingProcess> supplies = new HashMap<>();

    public AvailableOrders() {
        fillMap();
    }

    private void fillMap() {
        OrderingProcess extraFoodShop = new ExtraFoodShop();
        OrderingProcess glutenFreeShop = new GlutenFreeShop();
        OrderingProcess healthyShop = new HealthyShop();

        supplies.put("caviar", extraFoodShop);
        supplies.put("tuna", extraFoodShop);
        supplies.put("truffles", extraFoodShop);
        supplies.put("rice", glutenFreeShop);
        supplies.put("corn", glutenFreeShop);
        supplies.put("buckwheat", glutenFreeShop);
        supplies.put("tomato", healthyShop);
        supplies.put("pepper", healthyShop);
        supplies.put("cucumber", healthyShop);
    }

    public void process(Order order) {
        if (supplies.containsKey(order.getProductName())) {
            supplies.get(order.getProductName()).process(order);
        } else {
            System.out.println("We don't sell this type of product");
        }
    }
}
