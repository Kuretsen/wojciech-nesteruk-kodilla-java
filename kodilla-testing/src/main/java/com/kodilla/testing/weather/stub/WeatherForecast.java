package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            //adding 1 Celsius degree to current value
            //as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sumTemperatures = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sumTemperatures += temperature.getValue();
        }

        double averageTemperature = sumTemperatures / temperatures.getTemperatures().size();
        return averageTemperature;
    }

    public double medianTemperature() {
        ArrayList<Double> sortedTemperatures = new ArrayList<>();
        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {
            sortedTemperatures.add(temperature.getValue());
        }
        Collections.sort(sortedTemperatures);
        int modulo = sortedTemperatures.size() % 2;
        int middleValueEven = sortedTemperatures.size() / 2;
        double middleValueOdd = sortedTemperatures.size() / 2 + 0.5;
        double median = 0;
        if (modulo == 0) {
            median = (sortedTemperatures.get(middleValueEven-1) + sortedTemperatures.get(middleValueEven)) / 2;
            } else {
            median = sortedTemperatures.get((int)middleValueOdd);
        }
        return median;
    }
}

