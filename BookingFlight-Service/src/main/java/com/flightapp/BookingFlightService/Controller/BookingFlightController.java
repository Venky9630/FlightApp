package com.flightapp.BookingFlightService.Controller;

import com.flightapp.BookingFlightService.Service.BookingFlightService;
import com.flightapp.BookingFlightService.dto.BookingFlightDto;
import com.flightapp.BookingFlightService.ui.BookingFlightRequestModel;
import com.flightapp.BookingFlightService.ui.BookingFlightResponseModel;
import org.hibernate.cfg.Environment;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/flight/")
public class BookingFlightController {
	
	private final BookingFlightService airlineService;
	private final ModelMapper modelMapper;
	
	
	public BookingFlightController(BookingFlightService airlineService, ModelMapper modelmapper) {
		super();
		this.airlineService = airlineService;
		this.modelMapper = modelmapper;
	}

	@PostMapping("/booking/{flightId}")
	public ResponseEntity<BookingFlightResponseModel> registerAirline(@PathVariable("flightId") String flightId, @RequestBody BookingFlightRequestModel airlineRequestModel){
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		BookingFlightResponseModel airlineResponseModel = airlineService.registerAirline(modelMapper.map(airlineRequestModel, BookingFlightDto.class));
		return ResponseEntity.status(HttpStatus.CREATED).body(airlineResponseModel);
	}

}
