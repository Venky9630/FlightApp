package com.flightapp.BookingFlightService.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class BookingFlightServiceConfig {

    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
