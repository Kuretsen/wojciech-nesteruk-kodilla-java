package com.kodilla.exception.test;

public class SearchFlightRunner {
    public static void main(String[] args) {
        Flight warsawParis = new Flight("Warsaw", "Paris");
        Flight parisBerlin = new Flight("Paris", "Berlin");
        Flight moscowRome = new Flight("Moscow", "Rome");
        Flight berlinMoscow = new Flight("Berlin", "Moscow");

        SearchFlight searchFlight = new SearchFlight();

        try {
            searchFlight.findFlight(warsawParis);
        } catch (RouteNotFoundException e) {
            System.out.println("This flight doesn't exist at data base");
        }

        try {
            searchFlight.findFlight(parisBerlin);
        } catch (RouteNotFoundException e) {
            System.out.println("This flight doesn't exist at data base");
        }

        try {
            searchFlight.findFlight(moscowRome);
        } catch (RouteNotFoundException e) {
            System.out.println("This flight doesn't exist at data base");
        }

        try {
            searchFlight.findFlight(berlinMoscow);
        } catch (RouteNotFoundException e) {
            System.out.println("This flight doesn't exist at data base");
        }
    }
}
