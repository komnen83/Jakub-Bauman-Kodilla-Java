package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;


public class FlightSearcher {

    private FlightStorage flightStorage = new FlightStorage();

    public List<Flight> getAllFlightsFrom(String airportName) {

        List<Flight> listFlightFrom = flightStorage.getAvailableFlights().stream()
                .filter(f -> f.getArrivalAirport().equals(airportName))
                .collect(Collectors.toList());

        return listFlightFrom;
    }

    public List<Flight> getAllFlightsTo(String airportName) {

        List<Flight> listFlightTo = flightStorage.getAvailableFlights().stream()
                .filter(f -> f.getDepartureAirport().equals(airportName))
                .collect(Collectors.toList());

        return listFlightTo;
    }

    public boolean checkFlightFromTheCityToTheCityWithTransfer
            (String departureAirportName, String transferAirportName, String destinationAirportName)    {

//        boolean listFlightFromCityToTheCityWithTransfer = flightStorage.getAvailableFlights().stream()
//                .filter(flight -> flight.getDepartureAirport().equals(departureAirportName))
//                .filter(flight -> flight.getDepartureAirport().equals(destinationAirportName));

        List<Flight> transferFlights = flightStorage.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirportName))
                .filter(flight -> flight.getArrivalAirport().equals(transferAirportName))
                .collect(Collectors.toList());

        List<Flight> targetFlights = flightStorage.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(transferAirportName))
                .filter(flight -> flight.getArrivalAirport().equals(destinationAirportName))
                .collect(Collectors.toList());

        return !transferFlights.isEmpty() && !targetFlights.isEmpty();

    }
}
