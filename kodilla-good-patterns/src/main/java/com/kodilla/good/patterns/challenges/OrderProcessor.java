package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderProcessor {

    private final InformationService informationService;
    private final OrderService orderService;

    public OrderProcessor(InformationService informationService, OrderService orderService) {
        this.informationService = informationService;
        this.orderService = orderService;
    }
    public Order process(User user, String product, int quantity, LocalDate dateOfOrder, boolean isOrdered) {
        boolean result = orderService.order(new Order(user, product, quantity, dateOfOrder, isOrdered));
        informationService.sendInformationToUser(user);
        return new Order(user, product, quantity, dateOfOrder, isOrdered);
    }
}
