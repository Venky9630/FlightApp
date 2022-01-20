package com.flightapp.BookingFlightService.Controller;

import com.flightapp.BookingFlightService.Service.BookingFlightService;
import com.flightapp.BookingFlightService.dto.BookingFlightDto;
import com.flightapp.BookingFlightService.ui.BookingFlightRequestModel;
import com.flightapp.BookingFlightService.ui.BookingFlightResponseModel;
import com.flightapp.BookingFlightService.ui.TicketsResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1.0/flightBookingService/")
public class BookingFlightController {
	
	private final BookingFlightService bookingFlightService;
	private final ModelMapper modelMapper;
	
	
	public BookingFlightController(BookingFlightService bookingFlightService, ModelMapper modelmapper) {
		super();
		this.bookingFlightService = bookingFlightService;
		this.modelMapper = modelmapper;
	}

	@PostMapping("/booking/{flightId}")
	public ResponseEntity<BookingFlightResponseModel> registerAirline(@PathVariable("flightId") String flightId, @RequestBody BookingFlightRequestModel airlineRequestModel){
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		airlineRequestModel.setFlightId(flightId);
		BookingFlightResponseModel airlineResponseModel = bookingFlightService.registerAirline(modelMapper.map(airlineRequestModel, BookingFlightDto.class));
		return ResponseEntity.status(HttpStatus.CREATED).body(airlineResponseModel);
	}

	@GetMapping("/ticket/{pnr}")
	public ResponseEntity<TicketsResponseModel> getBookedTickets(@PathVariable("pnr") String pnr){

		return ResponseEntity.ok(bookingFlightService.getBookedTickets(pnr));
	}

}
