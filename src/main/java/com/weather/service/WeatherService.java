package com.weather.service;

import com.weather.example.WeatherFullResponse;
import com.weather.repository.api.CityApi;
import java.util.HashMap;
import java.util.Map;

public class WeatherService {

    private final CityApi cityApi;

    public WeatherService() {
        cityApi = new CityApi();
    }


    public String getTemperatureForCity(String city) {
        WeatherFullResponse data = cityApi.getData(city);
        return String.valueOf(data.getMain().getTemp());
    }

    public Map<String, String> getSummary(String city){
        WeatherFullResponse data = cityApi.getData(city);
        Map<String, String> summary = new HashMap<>();
        summary.put("Temperature" , String.valueOf(data.getMain().getTemp()));
        summary.put("Temp. min", String.valueOf(data.getMain().getTempMin()));
        summary.put("Temp. max", String.valueOf(data.getMain().getTempMax()));
        summary.put("Pressure", String.valueOf(data.getMain().getPressure()));
        summary.put("Humidity", String.valueOf(data.getMain().getHumidity()));
        summary.put("Wind Speed", String.valueOf(data.getWind().getSpeed()));
        summary.put("Clouds", String.valueOf(data.getClouds().getAll()));
        summary.put("visability", String.valueOf(data.getVisibility()));
        summary.put("message", String.valueOf(data.getSys().getMessage()));
        return summary;
    }
}
