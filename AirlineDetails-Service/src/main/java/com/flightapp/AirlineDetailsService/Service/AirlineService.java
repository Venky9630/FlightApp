package com.flightapp.AirlineDetailsService.Service;

import com.flightapp.AirlineDetailsService.dto.AirlineDto;
import com.flightapp.AirlineDetailsService.ui.AirlineResponseModel;

import java.util.List;

public interface AirlineService {

	public AirlineResponseModel registerAirline(AirlineDto airlineDto);

	public List<AirlineResponseModel> getAllAirlines();
}
