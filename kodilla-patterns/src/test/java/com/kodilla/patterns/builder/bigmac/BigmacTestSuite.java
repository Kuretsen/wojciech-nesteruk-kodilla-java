package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesame")
                .burgers(2)
                .sauce("Standard")
                .ingredient("Salad")
                .ingredient("Tomato")
                .ingredient("Onion")
                .ingredient("Cheese")
                .ingredient("Cucumber")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(5, howManyIngredients);
    }
}
