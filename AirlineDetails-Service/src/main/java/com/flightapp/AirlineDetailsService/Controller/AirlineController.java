package com.flightapp.AirlineDetailsService.Controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.flightapp.AirlineDetailsService.Service.AirlineService;
import com.flightapp.AirlineDetailsService.dto.AirlineDto;
import com.flightapp.AirlineDetailsService.exception.FileStorageException;
import com.flightapp.AirlineDetailsService.ui.AirlineRequestModel;
import com.flightapp.AirlineDetailsService.ui.AirlineResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/api/v1.0/flight/airline/")
public class AirlineController {
	
	private final AirlineService airlineService;
	private final ModelMapper modelMapper;
	private final AirlineDto airlineDto;


	public AirlineController(AirlineService airlineService, ModelMapper modelmapper, AirlineDto airlineDto) {
		super();
		this.airlineService = airlineService;
		this.modelMapper = modelmapper;
		this.airlineDto = airlineDto;

	}


	@PostMapping("/register")
	public ResponseEntity<AirlineResponseModel> registerAirline(@ModelAttribute AirlineRequestModel airlineRequestModel){
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		try{
			airlineDto.setAirlineName(airlineRequestModel.getAirlineName());
			airlineDto.setAirlineContactNumber(airlineRequestModel.getAirlineContactNumber());
			airlineDto.setAirlineAddress(airlineRequestModel.getAirlineAddress());
			airlineDto.setAirlineLogo(Base64.getEncoder().encodeToString(airlineRequestModel.getAirlineLogo().getBytes()));
			System.out.println(airlineDto.getAirlineLogo());

		}catch(IOException ex){
			throw new FileStorageException("AirlineLogo not add"+ex.getMessage());
		}

		AirlineResponseModel airlineResponseModel = airlineService.registerAirline(airlineDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(airlineResponseModel);
	}

	@GetMapping("/getAllAirlines")
	public ResponseEntity<List<AirlineResponseModel>> getAllAirlines(){

		return ResponseEntity.ok(airlineService.getAllAirlines());
	}

}
