package com.example.Weather_Web;

import jakarta.persistence.EntityManager;
import org.hibernate.engine.spi.SessionImplementor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@ConditionalOnClass({ LocalContainerEntityManagerFactoryBean.class, EntityManager.class, SessionImplementor.class })
//@EnableConfigurationProperties(JpaProperties.class)
//@Import(HibernateJpaConfiguration.class)
//@AutoConfiguration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan
@Configuration
@EntityScan("com.example.Weather_Web.entity")

//@EntityScan("com.example.Weather_Web.entity")
//@EnableJpaRepositories
//@EnableTransactionManagement

public class WeatherWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(WeatherWebApplication.class, args);

	}

}
