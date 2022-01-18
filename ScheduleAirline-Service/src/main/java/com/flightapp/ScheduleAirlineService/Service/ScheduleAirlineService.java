package com.flightapp.ScheduleAirlineService.Service;

import com.flightapp.ScheduleAirlineService.dto.ScheduleAirlineDto;
import com.flightapp.ScheduleAirlineService.ui.ScheduleAirlineResponseModel;

public interface ScheduleAirlineService {

	public ScheduleAirlineResponseModel registerAirline(ScheduleAirlineDto airlineDto);
}
