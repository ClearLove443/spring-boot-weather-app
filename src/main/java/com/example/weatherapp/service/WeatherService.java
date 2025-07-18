package com.example.weatherapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String WEATHER_API_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=YOUR_API_KEY&units=metric";

    public String getWeather(String city) {
        RestTemplate restTemplate = new RestTemplate();
        String url = String.format(WEATHER_API_URL, city);
        String weatherData = restTemplate.getForObject(url, String.class);
        
        // Save to file
        saveToFile(weatherData, city);
        
        return weatherData;
    }

    private void saveToFile(String data, String city) {
        String fileName = "weather_" + city + ".json";
        try {
            java.nio.file.Files.write(
                java.nio.file.Paths.get(fileName),
                data.getBytes()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}