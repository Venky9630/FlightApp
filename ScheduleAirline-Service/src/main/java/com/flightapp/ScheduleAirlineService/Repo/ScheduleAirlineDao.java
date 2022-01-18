package com.flightapp.ScheduleAirlineService.Repo;

import com.flightapp.ScheduleAirlineService.model.ScheduleAirline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleAirlineDao extends CrudRepository<ScheduleAirline, Long> {
	

}
