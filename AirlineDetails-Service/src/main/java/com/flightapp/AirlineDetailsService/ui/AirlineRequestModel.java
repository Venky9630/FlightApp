package com.flightapp.AirlineDetailsService.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AirlineRequestModel {
	
	@NotNull
	@Range(min = 5, max = 25, message = "airline name should not be greate than 25 characters")
	private String airlineName;
	
	@NotNull
	private String airlineLogo;
	
	@NotNull
	@Range(max = 10, message = "Contact Number should not be greater than 10 digits")
	private Integer airlineContactNumber;
	
	@NotNull
	private String airlineAddress;

}
