package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final String continent) {
        this.continentName = continent;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continent='" + continentName + '\'' +
                '}';
    }
}
