package com.example.Weather_Web.service;


import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
//    private final String API_KEY = "your_api_key_here";
//    private final String API_URL = "http://api.openweathermap.org/data/2.5/weather";
//
//    public JSONObject getWeatherData(String postalCode) {
//        String url = API_URL + "?zip=" + postalCode + ",us&appid=" + API_KEY;
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject(url, String.class);
//        return new JSONObject(response);
//    }
//

    private final String API_KEY = "your_valid_api_key_here"; // Replace with your actual API key
    private final String API_URL = "http://api.openweathermap.org/data/2.5/weather";

//    public JSONObject getWeatherData(String postalCode) {
//        String url = API_URL + "?zip=" + postalCode + ",us&appid=" + API_KEY;
//        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject(url, String.class);
//        return new JSONObject(response);
//    }
    public JSONObject getWeatherData(String postalCode) {
        String url = API_URL + "?zip=" + postalCode + ",us&appid=" + API_KEY;
        RestTemplate restTemplate = new RestTemplate();

        try {
            String response = restTemplate.getForObject(url, String.class);
            return new JSONObject(response);
        } catch (HttpClientErrorException e) {
            // Log the error or handle it as needed
            return new JSONObject().put("error", "Failed to fetch weather data: " + e.getMessage());
        }
    }

}
