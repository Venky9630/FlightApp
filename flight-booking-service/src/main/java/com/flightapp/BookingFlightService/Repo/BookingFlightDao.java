package com.flightapp.BookingFlightService.Repo;

import com.flightapp.BookingFlightService.model.BookingFlight;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingFlightDao extends CrudRepository<BookingFlight, Long> {

    @Query
    public BookingFlight findByPnr(String pnr);

}
