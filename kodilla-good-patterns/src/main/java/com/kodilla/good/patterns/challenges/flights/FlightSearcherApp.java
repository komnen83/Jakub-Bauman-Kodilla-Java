package com.kodilla.good.patterns.challenges.flights;

public class FlightSearcherApp {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight = new Flight("WARSZAWA", "GDANSK");

        System.out.println("List of flights to: " + flight.getArrivalAirport() + "\n" +
                        flightSearcher.getAllFlightsFrom("GDANSK"));
        System.out.println("List of flights from: " + flight.getDepartureAirport() + "\n" +
                        flightSearcher.getAllFlightsTo("WARSZAWA"));
        System.out.println
                (flightSearcher.checkFlightFromTheCityToTheCityWithTransfer
                        ("WROCLAW", "KRAKOW", "GDANSK"));
    }
}
