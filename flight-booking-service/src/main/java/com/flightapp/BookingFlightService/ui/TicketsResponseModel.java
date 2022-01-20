package com.flightapp.BookingFlightService.ui;

import com.flightapp.BookingFlightService.model.FlightDetails;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TicketsResponseModel {

        private String passengerName;

        private String emailId;

        private String gender;

        private String age;

        private String mealPreference;

        private String seatNumber;

        private String pnr;

	    private FlightDetails flightDetails;

    }
