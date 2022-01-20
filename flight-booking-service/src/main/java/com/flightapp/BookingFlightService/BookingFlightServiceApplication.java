package com.flightapp.BookingFlightService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BookingFlightServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingFlightServiceApplication.class, args);
	}

}
