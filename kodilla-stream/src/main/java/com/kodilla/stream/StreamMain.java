package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a+b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a-b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a*b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a/b);
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//        System.out.println();

//        System.out.println("7.1. Poem decorator");
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        String newText1 = poemBeautifier.beautify("Text to beautify", (text -> text.toUpperCase()));
//        System.out.println(newText1);
//        String newText2 = poemBeautifier.beautify("Text to beautify", (text -> "ABC" + text + "ABC"));
//        System.out.println(newText2);
//        String newText3 = poemBeautifier.beautify("Text to beautify", (text -> "Text: " +"\"" + text + "\"" + " have " + text.length() + " letters"));
//        System.out.println(newText3);
//        String newText4 = poemBeautifier.beautify("Text to beautify", (text -> "Middle letter of " + text + " is " + text.charAt(text.length()/2)));
//        System.out.println(newText4);
//        String newText5 = poemBeautifier.beautify("Text to beautify", (text -> text.replace(" ", "_")));
//        System.out.println(newText5);
//        System.out.println();

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
