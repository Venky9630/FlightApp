package com.flightapp.ScheduleAirlineService.Controller;

import com.flightapp.ScheduleAirlineService.Service.ScheduleAirlineService;
import com.flightapp.ScheduleAirlineService.dto.ScheduleAirlineDto;
import com.flightapp.ScheduleAirlineService.ui.ScheduleAirlineRequestModel;
import com.flightapp.ScheduleAirlineService.ui.ScheduleAirlineResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1.0/flight/")
public class ScheduleAirlineController {
	
	private final ScheduleAirlineService airlineService;
	private final ModelMapper modelMapper;
	

	public ScheduleAirlineController(ScheduleAirlineService airlineService, ModelMapper modelmapper) {
		super();
		this.airlineService = airlineService;
		this.modelMapper = modelmapper;
	}

	@PostMapping("/inventory/add")
	public ResponseEntity<ScheduleAirlineResponseModel> registerAirline(@RequestBody ScheduleAirlineRequestModel airlineRequestModel){
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		ScheduleAirlineResponseModel airlineResponseModel = airlineService.registerAirline(modelMapper.map(airlineRequestModel, ScheduleAirlineDto.class));
		return ResponseEntity.status(HttpStatus.CREATED).body(airlineResponseModel);
	}

	@GetMapping("/search")
	public ResponseEntity<List<ScheduleAirlineResponseModel>> searchScheduledAirlines(@RequestParam(required = true) String airline,
	@RequestParam(required = false) String flightNumber, @RequestParam(required = false) String instrumentUsed){

		return ResponseEntity.ok(airlineService.findAllByAirlineOrFlightNumberOrInstrumentUsed(airline,flightNumber,instrumentUsed));

	}

}
