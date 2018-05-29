package com.kodilla.exception.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    public void findFlight(Flight flight) throws RouteNotFoundException   {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Okecie", true);
        airports.put("Orly", false);
        airports.put("Heathrow", true);

        Boolean isFlightAvailable = airports.get(flight.getArrivalAirport());

        if(isFlightAvailable != true)   {
            throw new RouteNotFoundException("We have a problem here.");
        } else {
            System.out.println("Flight from: " + flight.getDepartureAirport() + " to " +
                    flight.getArrivalAirport() + " is possible");
        }
    }
}


