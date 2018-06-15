package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;


public class FlightSearcher {

    private FlightStorage flightStorage;

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
//
//    public boolean checkFlightFromTheCityToTheCityWithTransfer
//            (String departureAirportName, String transferAirportName, String destinationAirportName)    {
//
//        boolean listFlightFromCityToTheCityWithTransfer = flightStorage.getAvailableFlights().stream()
//                .filter(flight -> flight.getDepartureAirport().equals(departureAirportName))
//                .filter(flight -> flight.getDepartureAirport().equals(destinationAirportName));
//
//        return listFlightFromCityToTheCityWithTransfer;
//    }
}
