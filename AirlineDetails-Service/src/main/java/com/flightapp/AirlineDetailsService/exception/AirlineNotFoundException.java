package com.flightapp.AirlineDetailsService.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AirlineNotFoundException extends RuntimeException {

    private String message;
}
