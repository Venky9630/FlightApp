package com.flightapp.BookingFlightService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "AIRLINE_TABLE")
public class BookingFlight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "BOOKING_ID", unique = true)
	private String bookingId;
	
	@Column(name = "JOURNEY_TYPE")
	private String journeyType;
	
	@Column(name = "BOOKING_FROM")
	private String bookingFrom;
	
	@Column(name = "BOOKING_TO")
	private String bookingTo;
	
	@Column(name = "ONWARD_DATE")
	private String onWardDate;

	@Column(name = "RETURN_DATE")
	private String returnDate;

	@Column(name = "ONWARD_MEAL")
	private String onWardMealPreference;

	@Column(name = "RETURN_MEAL")
	private String returnMealPreference;

}
