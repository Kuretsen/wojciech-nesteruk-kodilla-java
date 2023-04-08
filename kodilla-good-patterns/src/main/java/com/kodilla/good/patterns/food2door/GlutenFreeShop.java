package com.kodilla.good.patterns.food2door;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements OrderingProcess{
    private final String name;
    private final Map<String, Integer> glutenFreeShopSupplies = new HashMap<>();

    public GlutenFreeShop() {
        this.name = "Gluten Free Shop";
        addProductsToMap();
    }

    public String getName() {
        return name;
    }

    private void addProductsToMap() {
        glutenFreeShopSupplies.put("rice", 600);
        glutenFreeShopSupplies.put("corn", 400);
        glutenFreeShopSupplies.put("buckwheat", 500);
    }
    private void updateSuppliesStatus(String product, Integer quantityOfProducts) {
        Integer depotStatus = glutenFreeShopSupplies.get(product) - quantityOfProducts;
        glutenFreeShopSupplies.put(product, depotStatus);
    }
    @Override
    public boolean process(Order order) {
        if (glutenFreeShopSupplies.containsKey(order.getProductName()) && glutenFreeShopSupplies.get(order.getProductName()) >= order.getProductQuantity()) {
            updateSuppliesStatus(order.getProductName(), order.getProductQuantity());
            System.out.println("You ordered " + order.getProductName() + " in quantity " + order.getProductQuantity());
            System.out.println("Your order number is: " + order.getOrderNumber());
            System.out.println("The order has been transferred for execution");
            System.out.println("Thank you and come back again");
            return true;
        } else {
            System.out.println("The selected product is not available.");
            return false;
        }
    }
}
