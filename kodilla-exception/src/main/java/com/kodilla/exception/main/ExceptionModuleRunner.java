package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearcher;

import java.util.HashMap;
import java.util.Map;

public class ExceptionModuleRunner {
    public static void main(String[] args)  {

//        FlightSearcher flightSearcher = new FlightSearcher();
        Map<FlightSearcher, Boolean> flightMap = new HashMap<>();

        try {
            flightMap.put(new FlightSearcher("asdf", true));
//            flightSearcher.findFlight("asfas", "sadfasf");
        } catch (Exception e) {
            System.out.println("Problem");
        }

//        FileReader fileReader = new FileReader();
//
//        try {
//            fileReader.readFile();
//        } catch (Exception e) {
//            System.out.println("Problem while reading a file!");
//        }

    }
}
