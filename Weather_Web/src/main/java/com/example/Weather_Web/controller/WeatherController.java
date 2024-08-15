package com.example.Weather_Web.controller;

import com.example.Weather_Web.entity.WeatherRequest;
import com.example.Weather_Web.service.WeatherService;
//import com.example.weatherapp.service.WeatherService;
import netscape.javascript.JSObject;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/weather")


public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @PostMapping("/fetch")
    public ResponseEntity<?> fetchWeather(@RequestBody WeatherRequest weatherRequest) {
        // Postal code validation
        String postalCode = weatherRequest.getPostalCode();
        String user = weatherRequest.getUser();
        if (!postalCode.matches("^[0-9]{5}(?:-[0-9]{4})?$")) {
            return ResponseEntity.badRequest().body("Invalid postal code format");
        }

        // Fetching weather data
        String weatherData = weatherService.getWeatherData(postalCode).toString();

        // Saving to database or additional processing can be done here

//        return ResponseEntity.ok(weatherData);
        return ResponseEntity.ok("Weather data for user " + user + ": " + weatherData);
    }


        @GetMapping("/{postalCode}")
        public ResponseEntity<?> getWeather (@PathVariable String postalCode){
            // Add postal code validation logic here
            if (!postalCode.matches("^[0-9]{5}(?:-[0-9]{4})?$")) {
                return ResponseEntity.badRequest().body("Invalid postal code format");
            }

            return ResponseEntity.ok(weatherService.getWeatherData(postalCode).toString());
        }
    }

