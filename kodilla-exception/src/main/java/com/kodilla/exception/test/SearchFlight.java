package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> flightsMap = new HashMap<>();
        flightsMap.put("Warsaw", true);
        flightsMap.put("Paris", true);
        flightsMap.put("Rome", true);
        flightsMap.put("Berlin", false);
        flightsMap.put("Moscow", false);

        if (flightsMap.containsKey(flight.getDepartureAirport()) &&
                flightsMap.get(flight.getDepartureAirport()) &&
                flightsMap.containsKey(flight.getArrivalAirport()) &&
                flightsMap.get(flight.getArrivalAirport())) {
            System.out.println("Flight found");;
        } else {
            throw new RouteNotFoundException();
        }
    }
}
