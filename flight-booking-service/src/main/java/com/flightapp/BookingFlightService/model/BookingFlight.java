package com.flightapp.BookingFlightService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "BOOKING_TABLE")
public class BookingFlight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "BOOKING_ID", unique = true)
	private String bookingId;

	@Column(name="NAME")
	private String passengerName;

	@Column(name="EMAILID")
	private String emailId;

	@Column(name = "GENDER")
	private String gender;

	@Column(name="AGE")
	private String age;

	@Column(name = "MEALTYPE")
	private String mealPreference;

	@Column(name = "SEATNUMBER")
	private String seatNumber;

	@Column(name="PNR")
	private String pnr;

	@Column(name="FLIGHTID")
	private String flightId;

}
