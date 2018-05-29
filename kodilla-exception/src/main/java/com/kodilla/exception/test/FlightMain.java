package com.kodilla.exception.test;

public class FlightMain {
    public static void main(String[] args) {

        FlightSearcher flightSearcher = new FlightSearcher();

        try {

            flightSearcher.findFlight(new Flight("Orly", "Okecie"));
            flightSearcher.findFlight(new Flight("Heathrow", "Orly"));
            flightSearcher.findFlight(new Flight("De Gaulle", "Heathrow"));

        } catch (RouteNotFoundException e) {
            System.out.println("We have a problem here.");
        }
    }
}
