package com.flightapp.ScheduleAirlineService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "FLIGHTS_TABLE")
public class ScheduleAirline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "FLIGHT_NUMBER", unique = true)
	private Integer flightNumber;
	
	@Column(name = "AIRLINE")
	private String airline;
	
	@Column(name = "FROM_PLACE")
	private String fromPlace;
	
	@Column(name = "TO_PLACE")
	private String toPlace;
	
	@Column(name = "START_DATETIME")
	private String startDateTime;

	@Column(name = "END_DATETIME")
	private String endDateTime;

	@Column(name = "INSTRUMENT_USED")
	private String instrumentUsed;

	@Column(name = "BUSINESSCLASS_SEATS")
	private String businessClassSeats;

	@Column(name = "NON_BUSINESSCLASS_SEATS")
	private String nonBusinessClassSeats;

	@Column(name = "TICKET_COST")
	private String ticketCost;

	@Column(name = "ROWS")
	private Integer rows;

	@Column(name = "MEAL_TYPE")
	private Integer mealType;

}
