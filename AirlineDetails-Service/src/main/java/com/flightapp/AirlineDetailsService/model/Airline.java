package com.flightapp.AirlineDetailsService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "AIRLINE_TABLE")
public class Airline {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "AIRLINE_ID", unique = true)
	private String airlineId;
	
	@Column(name = "AIRLINE_NAME", unique = true)
	private String airlineName;
	
	@Column(name = "AIRLINE_LOGO", unique = true)
	private String airlineLogo;
	
	@Column(name = "AIRLINE_NUMBER", unique = true)
	private Integer airlineNumber;
	
	@Column(name = "AIRLINE_ADDRESS")
	private String address;

}
