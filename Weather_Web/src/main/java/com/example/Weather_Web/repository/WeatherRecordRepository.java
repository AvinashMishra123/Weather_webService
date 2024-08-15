package com.example.Weather_Web.repository;

import com.example.Weather_Web.entity.WeatherRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository

public interface WeatherRecordRepository extends JpaRepository<WeatherRecord,Long> {
}
