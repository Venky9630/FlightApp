package com.flightapp.AirlineDetailsService.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AirlineResponseModel {

	private String airlineId;
	private String airlineName;
	private String airlineLogo;
	private String airlineContactNumber;
	private String airlineAddress;
	
}
