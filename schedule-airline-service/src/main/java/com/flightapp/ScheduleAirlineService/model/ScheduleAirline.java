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

	@Column(name = "FLIGHT_ID", unique = true)
	private String flightId;

	@Column(name = "FLIGHT_NUMBER", unique = true)
	private String flightNumber;
	
	@Column(name = "AIRLINE")
	private String airline;
	
	@Column(name = "CURRENT_PLACE")
	private String fromPlace;
	
	@Column(name = "DESTINATION")
	private String toPlace;
	
	@Column(name = "STARTDATETIME")
	private String startDateTime;

	@Column(name = "ENDDATETIME")
	private String endDateTime;

	@Column(name = "INSTRUMENT_USED")
	private String instrumentUsed;

	@Column(name = "BUSINESSCLASS_SEATS")
	private String businessClassSeats;

	@Column(name = "NORMAL_SEATS")
	private String nonBusinessClassSeats;

	@Column(name = "TICKET_COST")
	private String ticketCost;

	@Column(name = "FLIGHTROWS")
	private String rows;

	@Column(name = "MEAL_TYPE")
	private String mealType;

}
