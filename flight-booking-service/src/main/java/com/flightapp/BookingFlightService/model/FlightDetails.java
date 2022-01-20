package com.flightapp.BookingFlightService.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FlightDetails {

    private String flightId;
    private String flightNumber;
    private String airline;
    private String fromPlace;
    private String toPlace;
    private String startDateTime;
    private String endDateTime;
    private String instrumentUsed;
    private String businessClassSeats;
    private String nonBusinessClassSeats;
    private String ticketCost;
    private String rows;
    private String mealType;
}
