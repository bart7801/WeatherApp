package com.repository.api;

import com.example.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class CityApi {

    private final WeatherConnector weatherConnector;
    private final ObjectMapper objectMapper;

    public CityApi() {
        weatherConnector = new WeatherConnector();
        objectMapper = new ObjectMapper();
    }

    public String createUrlForWeather(String city) {
        return "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&APPID=aff3ccdce49c632c4e74f438c5e8faa4";
    }

    public Weather getData(String weather, String date) {
        try {
            String data = weatherConnector.downloadData(createUrlForWeather(weather, date));
            return objectMapper.readValue(data, Weather.class);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}