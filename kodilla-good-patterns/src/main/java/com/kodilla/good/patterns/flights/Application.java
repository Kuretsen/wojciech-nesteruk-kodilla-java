package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {

        FlightBase flightBase = new FlightBase();

        System.out.println(flightBase.findConnectingFlight("Warsaw", "Washington"));
        System.out.println(flightBase.findAllFlightsToThisCity("Paris"));
        System.out.println(flightBase.findAllFlightsFromThisCity("Moscow"));
    }
}
