package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal peopleQuantity;

    public Country(final String country, final BigDecimal peopleQuantity) {
        this.countryName = country;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountry() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
}
