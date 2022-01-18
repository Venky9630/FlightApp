package com.flightapp.BookingFlightService.Repo;

import com.flightapp.BookingFlightService.model.BookingFlight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingFlightDao extends CrudRepository<BookingFlight, Long> {
	

}
