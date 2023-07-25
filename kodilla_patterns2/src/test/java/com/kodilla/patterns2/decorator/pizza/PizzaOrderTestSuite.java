package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {
    @Test
    void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15),theCost);
    }

    @Test
    void testPizzaWithSalamiAndJalapenosGetDescriptionAndCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new JalapenosDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(25), theCost);
        assertEquals("Pizza with: dough, tomato sauce, cheese + salami + jalapenos", description);
    }

    @Test
    void testPizzaWithSalamiAndExtraCheeseGetDescriptionAndCost(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new SalamiDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals(new BigDecimal(25), theCost);
        assertEquals("Pizza with: dough, tomato sauce, cheese + salami + extra cheese", description);
    }

}