package com.flightapp.AirlineDetailsService.Config;

import com.flightapp.AirlineDetailsService.dto.AirlineDto;
import com.flightapp.AirlineDetailsService.model.Airline;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AirlineDetailsServiceConfig {


    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }

    @Bean
    public AirlineDto airlineDto()
    {
        return new AirlineDto();
    }


}
