package com.flightapp.BookingFlightService.Service;

import com.flightapp.BookingFlightService.dto.BookingFlightDto;
import com.flightapp.BookingFlightService.ui.BookingFlightResponseModel;

public interface BookingFlightService {

	public BookingFlightResponseModel registerAirline(BookingFlightDto airlineDto);
}
