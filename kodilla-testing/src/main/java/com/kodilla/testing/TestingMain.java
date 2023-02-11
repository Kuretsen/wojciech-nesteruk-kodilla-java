package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        int a = 5;
        int b = 60;
        Calculator calculator = new Calculator();
        int addingResult = calculator.addAToB(a, b);
        int subtractionResult = calculator.subtractAFromB(a, b);

        if ((addingResult == a+b) && (subtractionResult == b-a)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
