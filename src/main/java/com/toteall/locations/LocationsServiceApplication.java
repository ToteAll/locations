package com.toteall.locations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(Properties.class)
@SpringBootApplication
public class LocationsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationsServiceApplication.class, args);
	}
}
