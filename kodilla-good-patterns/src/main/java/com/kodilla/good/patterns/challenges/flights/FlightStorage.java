package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightStorage {

    private List<Flight> availableFlights;

    public FlightStorage(List<Flight> availableFlights) {

        availableFlights = new ArrayList<Flight>();

        availableFlights.add(new Flight("WROCLAW", "WARSZAWA"));
        availableFlights.add(new Flight("WROCLAW", "GDANSK"));
        availableFlights.add(new Flight("WARSZAWA", "GDANSK"));
        availableFlights.add(new Flight("KRAKOW", "WARSZAWA"));
        availableFlights.add(new Flight("KRAKOW", "GDANSK"));
    }

    public List<Flight> getAvailableFlights() {
        return availableFlights;
    }
}
