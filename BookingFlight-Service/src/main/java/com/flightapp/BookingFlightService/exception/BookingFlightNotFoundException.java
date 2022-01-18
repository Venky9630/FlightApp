package com.flightapp.BookingFlightService.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BookingFlightNotFoundException extends RuntimeException{

    private String message;
}
