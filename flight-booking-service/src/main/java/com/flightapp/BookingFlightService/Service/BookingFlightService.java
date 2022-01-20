package com.flightapp.BookingFlightService.Service;

import com.flightapp.BookingFlightService.dto.BookingFlightDto;
import com.flightapp.BookingFlightService.ui.BookingFlightResponseModel;
import com.flightapp.BookingFlightService.ui.TicketsResponseModel;

import java.util.List;

public interface BookingFlightService {

	public BookingFlightResponseModel registerAirline(BookingFlightDto airlineDto);

	public TicketsResponseModel getBookedTickets(String pnr);
}
