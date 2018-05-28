package com.kodilla.exception.test;

import java.util.LinkedList;
import java.util.List;

public class FlightMain {
    public static void main(String[] args) throws RouteNotFoundException {

        FlightSearcher flightSearcher = new FlightSearcher();

            flightSearcher.findFlight(new Flight("Orly", "Okecie"));
            flightSearcher.findFlight(new Flight("Heathrow", "De Gaulle"));

        Flight flight1 = new Flight("Orly", "Okecie");
        Flight flight2 = new Flight("Orly", "Heathrow");
        Flight flight3 = new Flight("Heathrow", "De Gaulle");

        List<Flight> flights = new LinkedList<>();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        for(Flight a : flights) {
            System.out.println(a);
        }
        System.out.println(flightSearcher);
    }
}
