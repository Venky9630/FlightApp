package com.flightapp.ScheduleAirlineService.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ScheduleAirlineNotFoundException extends RuntimeException{

    private String message;
}
