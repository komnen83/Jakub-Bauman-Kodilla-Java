package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country france = new Country("France", new BigDecimal("60000000"));
        Country usa = new Country("Usa", new BigDecimal("3000000000"));
        Country canada = new Country("Canada", new BigDecimal("80000000"));
        Country mexico = new Country("Mexico", new BigDecimal("20000000"));
        Country china = new Country("France", new BigDecimal("3000000000"));
        Country russia = new Country("France", new BigDecimal("200000000"));
        Country japan = new Country("France", new BigDecimal("2000000"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Continent northAmerica = new Continent("North America");
        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);

        Continent asia = new Continent("Asia");
        asia.addCountry(china);
        asia.addCountry(russia);
        asia.addCountry(japan);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(northAmerica);
        world.addContinent(asia);

        //When
        BigDecimal population = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(new BigDecimal("6482000000"), population);
    }
}
