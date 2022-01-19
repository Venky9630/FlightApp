package com.flightapp.AirlineDetailsService.Service;

import com.flightapp.AirlineDetailsService.Repo.AirlineDao;
import com.flightapp.AirlineDetailsService.dto.AirlineDto;
import com.flightapp.AirlineDetailsService.exception.FileStorageException;
import com.flightapp.AirlineDetailsService.model.Airline;
import com.flightapp.AirlineDetailsService.ui.AirlineResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
public class AirlineServiceImpl implements AirlineService{
	
	private final AirlineDao airlineDao;
	private final ModelMapper modelMapper;

	public AirlineServiceImpl(AirlineDao airlineDao, ModelMapper modelMapper) {
		super();
		this.airlineDao = airlineDao;
		this.modelMapper = modelMapper;
	}


	@Override
	public AirlineResponseModel registerAirline(AirlineDto airlineDto) {

		airlineDto.setAirlineId(UUID.randomUUID().toString());

		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

		Airline airline = modelMapper.map(airlineDto, Airline.class);

		return modelMapper.map(airlineDao.save(airline), AirlineResponseModel.class);
	}

	@Override
	public List<AirlineResponseModel> getAllAirlines() {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		List<AirlineResponseModel> createAirlineResponseModels=new ArrayList<>();
		Iterable<Airline> iterable= airlineDao.findAll();
		Iterator<Airline> iterator=iterable.iterator();
		while(iterator.hasNext()) {
			createAirlineResponseModels.add(modelMapper.map(iterator.next(),AirlineResponseModel.class));
		}
		return createAirlineResponseModels;
	}

}
