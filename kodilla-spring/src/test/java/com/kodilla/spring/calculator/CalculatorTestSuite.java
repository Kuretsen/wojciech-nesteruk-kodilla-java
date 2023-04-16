package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    public void testAdd() {
        //Given

        //When
        double result = calculator.add(5, 7);

        //Then
        Assertions.assertEquals(result, 12);
    }

    @Test
    public void testSub() {
        //Given

        //When
        double result = calculator.sub(7, 5);

        //Then
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void testMul() {
        //Given

        //When
        double result = calculator.mul(5, 7);

        //Then
        Assertions.assertEquals(result, 35);
    }

    @Test
    public void testDiv(){
        //Given

        //When
        double result = calculator.div(110, 5);

        //Then
        Assertions.assertEquals(result, 22);
    }
}
