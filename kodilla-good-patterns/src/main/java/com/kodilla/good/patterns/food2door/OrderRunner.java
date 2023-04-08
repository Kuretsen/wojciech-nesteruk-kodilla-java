package com.kodilla.good.patterns.food2door;

public class OrderRunner {
    public static void main(String[] args) {
        Order order1 = new Order("tuna", 5, 2597);
        Order order2 = new Order("corn", 3, 2599);
        Order order3 = new Order("tomato", 30, 2601);
        Order order4 = new Order("orange", 2, 2603);

        AvailableOrders availableOrders = new AvailableOrders();
        availableOrders.process(order1);
        availableOrders.process(order2);
        availableOrders.process(order3);
        availableOrders.process(order4);
    }
}
