package com.flightapp.ScheduleAirlineService.Service;

import com.flightapp.ScheduleAirlineService.dto.ScheduleAirlineDto;
import com.flightapp.ScheduleAirlineService.ui.ScheduleAirlineResponseModel;

import java.util.List;

public interface ScheduleAirlineService {

	public ScheduleAirlineResponseModel registerAirline(ScheduleAirlineDto airlineDto);

	public List<ScheduleAirlineResponseModel> findAllByAirlineOrFlightNumberOrInstrumentUsed(String airline, String flightNumber, String instrumentUsed);
}
