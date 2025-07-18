package com.example.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @GetMapping("/weather/{city}")
    public String getWeather(@PathVariable String city) {
        return "Current weather in " + city + ": Sunny, 25°C"; // Placeholder response
    }
}