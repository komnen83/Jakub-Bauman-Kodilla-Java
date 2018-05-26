package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    public void findFlight(Flight flight) throws RouteNotFoundException   {

        Map<String, Boolean> flights = new HashMap<>();

        try {
            flights.put(new Flight("Orly", true);
            flights.get("Orly");
        } catch (Exception e)  {
            throw new RouteNotFoundException();
        }
    }
}
