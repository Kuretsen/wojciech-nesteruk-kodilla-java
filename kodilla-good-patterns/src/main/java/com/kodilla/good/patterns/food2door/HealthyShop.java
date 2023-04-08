package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements OrderingProcess{
    private final String name;
    private final Map<String, Integer> healthyShopSupplies = new HashMap<>();

    public HealthyShop () {
        this.name = "Healthy Shop";
        addProductsToMap();
    }

    public String getName() {
        return name;
    }

    private void addProductsToMap() {
        healthyShopSupplies.put("tomato", 900);
        healthyShopSupplies.put("pepper", 800);
        healthyShopSupplies.put("cucumber", 1000);
    }
    private void updateSuppliesStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = healthyShopSupplies.get(product) - quantityOfProducts;
        healthyShopSupplies.put(product, depotStatus);
    }
    @Override
    public boolean process(Order order) {
        if (healthyShopSupplies.containsKey(order.getProductName()) && healthyShopSupplies.get(order.getProductName()) >= order.getProductQuantity()) {
            updateSuppliesStatus(order.getProductName(), order.getProductQuantity());
            System.out.println("Your order number is: " + order.getOrderNumber());
            System.out.println("You ordered " + order.getProductName() + " in quantity " + order.getProductQuantity());
            System.out.println("The order has been transferred for execution");
            System.out.println("Thank you and come back again");
            return true;
        } else {
            System.out.println("The selected product is not available.");
            return false;
        }
    }
}
