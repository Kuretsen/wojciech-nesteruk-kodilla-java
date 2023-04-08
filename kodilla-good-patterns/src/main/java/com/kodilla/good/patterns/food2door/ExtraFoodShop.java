package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements OrderingProcess {
    private final String name;
    private final Map<String, Integer> extraFoodShopSupplies = new HashMap<>();

    public ExtraFoodShop() {
        this.name = "Extra Food Shop";
        addProductsToMap();
    }

    public String getName() {
        return name;
    }

    private void addProductsToMap() {
        extraFoodShopSupplies.put("caviar", 500);
        extraFoodShopSupplies.put("tuna", 100);
        extraFoodShopSupplies.put("truffles", 100);
    }
    private void updateSuppliesStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = extraFoodShopSupplies.get(product) - quantityOfProducts;
        extraFoodShopSupplies.put(product, depotStatus);
    }
    @Override
    public boolean process(Order order) {
        if (extraFoodShopSupplies.containsKey(order.getProductName()) && extraFoodShopSupplies.get(order.getProductName()) >= order.getProductQuantity()) {
            updateSuppliesStatus(order.getProductName(), order.getProductQuantity());
            System.out.println("Your order number is: " + order.getOrderNumber());
            System.out.println("You ordered " + order.getProductName() + " in quantity " + order.getProductQuantity());
            System.out.println("The order has been transferred for execution");
            System.out.println("Thank you and come back again");
            System.out.println(getName());
            return true;
        } else {
            System.out.println("The selected product is not available.");
            return false;
        }
    }
}
