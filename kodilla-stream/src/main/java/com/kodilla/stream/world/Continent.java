package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> listOfCountries = new ArrayList<>();
    private final String continentName;

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public List<Country> getListOfCountries() {
        return new ArrayList<>(listOfCountries);
    }

    public String getContinentName() {
        return continentName;
    }
    public void addCountry(Country country) {
        listOfCountries.add(country);
    }
}
