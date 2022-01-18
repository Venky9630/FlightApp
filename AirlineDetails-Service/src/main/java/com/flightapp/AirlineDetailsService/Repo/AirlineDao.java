package com.flightapp.AirlineDetailsService.Repo;

import com.flightapp.AirlineDetailsService.model.Airline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineDao extends CrudRepository<Airline, Long> {


}
