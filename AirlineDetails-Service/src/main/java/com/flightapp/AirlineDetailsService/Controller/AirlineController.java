package com.flightapp.AirlineDetailsService.Controller;

import com.flightapp.AirlineDetailsService.Service.AirlineService;
import com.flightapp.AirlineDetailsService.dto.AirlineDto;
import com.flightapp.AirlineDetailsService.ui.AirlineRequestModel;
import com.flightapp.AirlineDetailsService.ui.AirlineResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/flight/airline/")
public class AirlineController {
	
	private final AirlineService airlineService;
	private final ModelMapper modelMapper;
	
	public AirlineController(AirlineService airlineService, ModelMapper modelmapper) {
		super();
		this.airlineService = airlineService;
		this.modelMapper = modelmapper;
	}


	@PostMapping("/register")
	public ResponseEntity<AirlineResponseModel> registerAirline(@RequestBody AirlineRequestModel airlineRequestModel){
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		AirlineResponseModel airlineResponseModel = airlineService.registerAirline(modelMapper.map(airlineRequestModel, AirlineDto.class));
		return ResponseEntity.status(HttpStatus.CREATED).body(airlineResponseModel);
	}

}
