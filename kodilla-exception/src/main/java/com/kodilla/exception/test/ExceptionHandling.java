package com.kodilla.exception.test;

public class ExceptionHandling {
    public String probablyIWillThrowException() {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("Invalid method arduments");
        } finally {
            System.out.println();
        }
        return "Done!";
    }
}
