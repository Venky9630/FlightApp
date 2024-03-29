package com.flightapp.ScheduleAirlineService.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ScheduleAirlineResponseModel {

	private String flightId;
	private String flightNumber;
	private String airline;
	private String fromPlace;
	private String toPlace;
	private String startDateTime;
	private String endDateTime;
	private String instrumentUsed;
	private String businessClassSeats;
	private String nonBusinessClassSeats;
	private String ticketCost;
	private String rows;
	private String mealType;
	
}
