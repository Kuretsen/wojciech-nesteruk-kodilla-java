package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuit {
    @Test
    void testGetAverage() {
        //Given
        int numbers [] = {35, 49, 22, 97, 105, 3, 9, 17, 16, 37, 21};
        double expected = 37.36;
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(expected, result, 0.01);
    }
}
