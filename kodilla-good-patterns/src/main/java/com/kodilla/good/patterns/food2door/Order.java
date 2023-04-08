package com.kodilla.good.patterns.food2door;

public class Order {
    public String productName;
    public int productQuantity;
    public int orderNumber;

    public Order(String productName, int productQuantity, int orderNumber) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.orderNumber = orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public int getOrderNumber() {
        return orderNumber;
    }
}
