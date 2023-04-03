package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderProcessRunner {
    public static void main(String[] args) {
        InformationService informationService = new OrderdInformationService();
        OrderService orderService = new ProductOrderService();
        OrderProcessor orderProcessor = new OrderProcessor(informationService, orderService);
        orderProcessor.process(new User("Wojciech", "Nesteruk"), "\"Game of Throne\" season 1", 1, LocalDate.of(2023, 4, 3), true);
    }
}
