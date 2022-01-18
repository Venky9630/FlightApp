package com.flightapp.ScheduleAirlineService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ScheduleAirlineDto {

	private Integer flightNumber;
	private String airline;
	private String fromPlace;
	private String toPlace;
	private String startDateTime;
	private String endDateTime;
	private String instrumentUsed;
	private String businessClassSeats;
	private String nonBusinessClassSeats;
	private String ticketCost;
	private Integer rows;
	private Integer mealType;
	
}
