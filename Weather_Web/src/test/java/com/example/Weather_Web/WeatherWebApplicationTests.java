package com.example.Weather_Web;

import com.example.Weather_Web.service.WeatherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class WeatherWebApplicationTests {


	@Autowired
	private WeatherService weatherService;



	@Test
	void contextLoads() {
	}

	@Test
	void testGetWeatherData() {
		assertNotNull(weatherService.getWeatherData("10001"));
	}

}
