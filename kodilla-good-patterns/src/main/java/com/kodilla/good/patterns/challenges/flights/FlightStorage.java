package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightStorage {

    private List<Flight> availableFlights;

    public FlightStorage() {

        availableFlights = new ArrayList<Flight>();

        availableFlights.add(new Flight("WROCLAW", "WARSZAWA"));
        availableFlights.add(new Flight("WROCLAW", "GDANSK"));
        availableFlights.add(new Flight("GDANSK", "WROCLAW"));
        availableFlights.add(new Flight("GDANSK", "WARSZAWA"));
        availableFlights.add(new Flight("KRAKOW", "GDANSK"));
        availableFlights.add(new Flight("KRAKOW", "WARSZAWA"));
        availableFlights.add(new Flight("WARSZAWA", "GDANSK"));
        availableFlights.add(new Flight("WARSZAWA", "WROCLAW"));
        availableFlights.add(new Flight("WARSZAWA", "KRAKOW"));
    }

    public List<Flight> getAvailableFlights() {
        return availableFlights;
    }
}
