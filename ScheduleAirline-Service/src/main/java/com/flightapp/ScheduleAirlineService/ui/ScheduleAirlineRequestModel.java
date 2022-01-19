package com.flightapp.ScheduleAirlineService.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ScheduleAirlineRequestModel {

	@NotNull
	private String flightNumber;
	@NotNull
	private String airline;
	@NotNull
	private String fromPlace;
	@NotNull
	private String toPlace;
	@NotNull
	private String startDateTime;
	@NotNull
	private String endDateTime;
	@NotNull
	private String instrumentUsed;
	@NotNull
	private String businessClassSeats;
	@NotNull
	private String nonBusinessClassSeats;
	@NotNull
	private String ticketCost;
	@NotNull
	private String rows;
	@NotNull
	private String mealType;

}
