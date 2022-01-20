package com.flightapp.BookingFlightService.Service;

import com.flightapp.BookingFlightService.Repo.BookingFlightDao;
import com.flightapp.BookingFlightService.dto.BookingFlightDto;
import com.flightapp.BookingFlightService.model.BookingFlight;
import com.flightapp.BookingFlightService.model.FlightDetails;
import com.flightapp.BookingFlightService.ui.BookingFlightResponseModel;
import com.flightapp.BookingFlightService.ui.TicketsResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class BookingFlightServiceImpl implements BookingFlightService {

	private final BookingFlightDao bookingFlightDao;
	private final ModelMapper modelMapper;
	private RestTemplate restTemplate;


	public BookingFlightServiceImpl(BookingFlightDao bookingFlightDao, ModelMapper modelMapper, RestTemplate restTemplate) {
		super();
		this.bookingFlightDao = bookingFlightDao;
		this.modelMapper = modelMapper;
		this.restTemplate = restTemplate;
	}


	@Override
	public BookingFlightResponseModel registerAirline(BookingFlightDto bookingFlightDto) {

		bookingFlightDto.setBookingId(UUID.randomUUID().toString());
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		Random rnd = new Random();
		int pnr = 100001 + rnd.nextInt(900000);
		bookingFlightDto.setPnr(String.valueOf(pnr));

		BookingFlight flightBooking = modelMapper.map(bookingFlightDto, BookingFlight.class);
		return modelMapper.map(bookingFlightDao.save(flightBooking), BookingFlightResponseModel.class);
	}

	@Override
	public TicketsResponseModel getBookedTickets(String pnr) {
		BookingFlight bookedTickets = bookingFlightDao.findByPnr(pnr);
			FlightDetails flightDetails = restTemplate.getForObject("http://schedule-airline-service/api/v1.0/flight/search?flightId=" + bookedTickets.getFlightId(), FlightDetails.class);
			TicketsResponseModel ticketsResponseModel = new TicketsResponseModel();
			ticketsResponseModel.setFlightDetails(flightDetails);
			ticketsResponseModel.setAge(bookedTickets.getAge());
			ticketsResponseModel.setEmailId(bookedTickets.getEmailId());
			ticketsResponseModel.setGender(bookedTickets.getGender());
			ticketsResponseModel.setMealPreference(bookedTickets.getMealPreference());
			ticketsResponseModel.setPassengerName(bookedTickets.getPassengerName());
			ticketsResponseModel.setSeatNumber(bookedTickets.getSeatNumber());
			ticketsResponseModel.setPnr(bookedTickets.getPnr());
			return ticketsResponseModel;
	}

}
