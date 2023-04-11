package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightBase {
    private final List<Flight> arrivalsAndDepartures = new ArrayList<>();

    public FlightBase() {
        addFlights();
    }

    private List<Flight> addFlights() {
        arrivalsAndDepartures.add(new Flight("Warsaw", "Paris"));
        arrivalsAndDepartures.add(new Flight("Berlin", "Paris"));
        arrivalsAndDepartures.add(new Flight("Paris", "Washington"));
        arrivalsAndDepartures.add(new Flight("Washington", "San Jose"));
        arrivalsAndDepartures.add(new Flight("Rome", "Moscow"));
        arrivalsAndDepartures.add(new Flight("Moscow", "Berlin"));
        arrivalsAndDepartures.add(new Flight("Athens", "Rome"));
        arrivalsAndDepartures.add(new Flight("Warsaw", "Athens"));
        arrivalsAndDepartures.add(new Flight("Madrid", "Paris"));
        return arrivalsAndDepartures;
    }
    public Set<Flight> findConnectingFlight(String departureAirport, String arrivalAirport) {
        Set<Flight> results = new HashSet<>();
        List<Flight> flightsWithAMatchingDepartureAirport = arrivalsAndDepartures.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        List<Flight> flightsWithAMatchingArrivalAirport = arrivalsAndDepartures.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        for (Flight flight1 : flightsWithAMatchingDepartureAirport) {
            for (Flight flight2 : flightsWithAMatchingArrivalAirport) {
                if (flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    results.add(flight1);
                    results.add(flight2);
                }
            }
        }
        return results;
    }

    public Set<Flight> findAllFlightsToThisCity(String city) {
        return arrivalsAndDepartures.stream()
                .filter(flight -> flight.getArrivalAirport().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findAllFlightsFromThisCity(String city) {
        return arrivalsAndDepartures.stream()
                .filter(flight -> flight.getDepartureAirport().equals(city))
                .collect(Collectors.toSet());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightBase that = (FlightBase) o;

        return arrivalsAndDepartures != null ? arrivalsAndDepartures.equals(that.arrivalsAndDepartures) : that.arrivalsAndDepartures == null;
    }

    @Override
    public int hashCode() {
        return arrivalsAndDepartures != null ? arrivalsAndDepartures.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "FlightBase{" +
                "arrivalsAndDepartures=" + arrivalsAndDepartures +
                '}';
    }
}
