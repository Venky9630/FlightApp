package com.flightapp.BookingFlightService.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookingFlightResponseModel {

	private String bookingId;
	private String journeyType;
	private String bookingFrom;
	private String bookingTo;
	private String onWardDate;
	private String returnDate;
	private String onWardMealPreference;
	private String returnMealPreference;
	private Integer totalCost;
	
}
