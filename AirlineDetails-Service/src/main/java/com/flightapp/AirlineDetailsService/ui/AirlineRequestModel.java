package com.flightapp.AirlineDetailsService.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AirlineRequestModel {
	
	@NotNull
	@Range(min = 5, max = 25, message = "airline name should not be greater than 25 characters")
	private String airlineName;
	
	@NotNull
	private MultipartFile airlineLogo;
	
	@NotNull
	@Range(max = 12, message = "Contact Number should not be greater than 10 digits")
	private String airlineContactNumber;
	
	@NotNull
	private String airlineAddress;

}
