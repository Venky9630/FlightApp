package com.flightapp.AirlineDetailsService.Service;

import com.flightapp.AirlineDetailsService.dto.AirlineDto;
import com.flightapp.AirlineDetailsService.ui.AirlineResponseModel;

public interface AirlineService {

	public AirlineResponseModel registerAirline(AirlineDto airlineDto);
}
