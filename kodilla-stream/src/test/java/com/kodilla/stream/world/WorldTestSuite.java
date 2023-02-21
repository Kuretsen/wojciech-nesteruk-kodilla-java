package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();

        Continent europa = new Continent("Europa");
        Continent asia = new Continent("Asia");
        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");

        Country poland = new Country("Poland", new BigDecimal("37750000"));
        Country germany = new Country("Germany", new BigDecimal("83200000"));
        Country france = new Country("France", new BigDecimal("67750000"));
        Country italy = new Country("Italy", new BigDecimal("59110000"));
        Country china = new Country("China", new BigDecimal("1412000000"));
        Country india = new Country("India", new BigDecimal("1408000000"));
        Country japan = new Country("Japan", new BigDecimal("125700000"));
        Country southKorea = new Country("South Korea", new BigDecimal("51740000"));
        Country usa = new Country("USA", new BigDecimal("331900000"));
        Country canada = new Country("Canada", new BigDecimal("38250000"));
        Country mexico = new Country("Mexico", new BigDecimal("126700000"));
        Country cuba = new Country("Cuba", new BigDecimal("11260000"));
        Country brazil = new Country("Brazil", new BigDecimal("214300000"));
        Country argentina = new Country("Argentina", new BigDecimal("45810000"));
        Country columbia = new Country("Columbia", new BigDecimal("51520000"));
        Country chile = new Country("Chile", new BigDecimal("19490000"));

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(northAmerica);
        world.addContinent(southAmerica);

        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(france);
        europa.addCountry(italy);

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);
        asia.addCountry(southKorea);

        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);
        northAmerica.addCountry(mexico);
        northAmerica.addCountry(cuba);

        southAmerica.addCountry(brazil);
        southAmerica.addCountry(argentina);
        southAmerica.addCountry(columbia);
        southAmerica.addCountry(chile);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("4084480000");
        assertEquals(totalPeopleExpected,totalPeople);
    }
}
