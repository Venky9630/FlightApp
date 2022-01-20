package com.flightapp.BookingFlightService.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BookingFlightRequestModel {

	private String flightId;

	private String passengerName;

	private String emailId;

	private String gender;

	private String age;

	private String mealPreference;

	private String seatNumber;

}
