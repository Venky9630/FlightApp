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
	private String journeyType;
	private String bookingFrom;
	private String bookingTo;
	private String onWardDate;
	private String returnDate;
	private String onWardMealPreference;
	private String returnMealPreference;
	private Integer totalCost;
	

}
