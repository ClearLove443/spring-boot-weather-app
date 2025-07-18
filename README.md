# Spring Boot Weather App

A Spring Boot application that fetches weather data via a REST API and saves it to a file.

## Features
- Fetch weather data for a city using OpenWeatherMap API.
- Save the fetched data to a JSON file.
- Expose a REST endpoint `/weather/{city}` to get the weather.

## Setup
1. Clone the repository.
2. Replace `YOUR_API_KEY` in `WeatherService.java` with your OpenWeatherMap API key.
3. Run the application using `mvn spring-boot:run`.

## Usage
- Access the endpoint: `http://localhost:8080/weather/{city}`
- Example: `http://localhost:8080/weather/London`