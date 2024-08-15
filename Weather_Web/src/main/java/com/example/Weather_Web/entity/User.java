package com.example.Weather_Web.entity;
//package com.example.weatherapp.model;

import jakarta.persistence.*;

//import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private boolean active;

    @OneToMany(mappedBy = "user")
    private List<WeatherRecord> weatherRecords;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<WeatherRecord> getWeatherRecords() {
        return weatherRecords;
    }

    public void setWeatherRecords(List<WeatherRecord> weatherRecords) {
        this.weatherRecords = weatherRecords;
    }
// Getters and Setters
}
