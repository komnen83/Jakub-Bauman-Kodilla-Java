package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {
    @Override
    public String toString() {
        return "FlightSearcher{}";
    }

    public void findFlight(Flight flight) throws RouteNotFoundException   {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Okecie", true);
        airports.put("Orly", false);
        airports.put("Heathrow", true);

    }
}
