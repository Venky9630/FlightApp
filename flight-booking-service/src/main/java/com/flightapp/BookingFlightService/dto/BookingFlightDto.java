package com.flightapp.BookingFlightService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BookingFlightDto {

	private String bookingId;

	private String flightId;

	private String passengerName;

	private String emailId;

	private String gender;

	private String age;

	private String mealPreference;

	private String seatNumber;

	private String pnr;


}
