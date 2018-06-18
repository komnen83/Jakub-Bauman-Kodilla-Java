package com.kodilla.good.patterns.challenges.flights;

public class FlightSearcherApp {
    public static void main(String[] args) {

        FlightStorage flightStorage = new FlightStorage();
        FlightSearcher flightSearcher = new FlightSearcher();

        System.out.println(flightSearcher.getAllFlightsFrom("GDANSK"));
        System.out.println(flightSearcher.getAllFlightsTo("WARSZAWA"));
        System.out.println(flightSearcher.checkFlightFromTheCityToTheCityWithTransfer
                ("WROCLAW", "KRAKOW", "GDANSK"));
    }
}
