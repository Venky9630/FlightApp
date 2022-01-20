package com.flightapp.ScheduleAirlineService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScheduleAirlineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleAirlineServiceApplication.class, args);
	}

}
