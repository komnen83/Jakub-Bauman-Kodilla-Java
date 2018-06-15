package com.kodilla.good.patterns.challenges.flights;

public class FlightSearcherApp {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        System.out.println(flightSearcher.getAllFlightsFrom("WARSZAWA"));
    }
}
