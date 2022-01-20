package com.flightapp.ScheduleAirlineService.Service;

import com.flightapp.ScheduleAirlineService.Repo.ScheduleAirlineDao;
import com.flightapp.ScheduleAirlineService.dto.ScheduleAirlineDto;
import com.flightapp.ScheduleAirlineService.model.ScheduleAirline;
import com.flightapp.ScheduleAirlineService.ui.ScheduleAirlineResponseModel;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Service
public class ScheduleAirlineServiceImpl implements ScheduleAirlineService {
	
	private final ScheduleAirlineDao airlineDao;
	private final ModelMapper modelMapper;


	public ScheduleAirlineServiceImpl(ScheduleAirlineDao ScheduleAirlineDao, ModelMapper modelMapper) {
		super();
		this.airlineDao = ScheduleAirlineDao;
		this.modelMapper = modelMapper;
	}


	@Override
	public ScheduleAirlineResponseModel registerAirline(ScheduleAirlineDto scheduleAirlineDto) {

		scheduleAirlineDto.setFlightId(UUID.randomUUID().toString());

		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ScheduleAirline airline = modelMapper.map(scheduleAirlineDto, ScheduleAirline.class);
		return modelMapper.map(airlineDao.save(airline), ScheduleAirlineResponseModel.class);
	}

	@Override
	public List<ScheduleAirlineResponseModel> findAllByAirlineOrFlightNumberOrInstrumentUsed(String airline, String flightNumber, String instrumentUsed, String flightId) {
		List<ScheduleAirlineResponseModel> createSearchAirlineResponseModels=new ArrayList<>();
		Iterable<ScheduleAirline> iterable= airlineDao.findAllByAirlineOrFlightNumberOrInstrumentUsedOrFlightId(airline, flightNumber, instrumentUsed, flightId);
		Iterator<ScheduleAirline> iterator=iterable.iterator();
		while(iterator.hasNext()) {
			createSearchAirlineResponseModels.add(modelMapper.map(iterator.next(),ScheduleAirlineResponseModel.class));
		}
		return createSearchAirlineResponseModels;
	}

}
