package com.flightapp.BookingFlightService.Service;

import com.flightapp.BookingFlightService.Repo.BookingFlightDao;
import com.flightapp.BookingFlightService.dto.BookingFlightDto;
import com.flightapp.BookingFlightService.model.BookingFlight;
import com.flightapp.BookingFlightService.ui.BookingFlightResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BookingFlightServiceImpl implements BookingFlightService {
	
	private final BookingFlightDao airlineDao;
	private final ModelMapper modelMapper;

	
	public BookingFlightServiceImpl(BookingFlightDao bookingFlightDao, ModelMapper modelMapper) {
		super();
		this.airlineDao = bookingFlightDao;
		this.modelMapper = modelMapper;
	}


	@Override
	public BookingFlightResponseModel registerAirline(BookingFlightDto bookingFlightDto) {

		bookingFlightDto.setBookingId(UUID.randomUUID().toString());
		
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		BookingFlight airline = modelMapper.map(bookingFlightDto, BookingFlight.class);
		return modelMapper.map(airlineDao.save(airline), BookingFlightResponseModel.class);
	}

}
