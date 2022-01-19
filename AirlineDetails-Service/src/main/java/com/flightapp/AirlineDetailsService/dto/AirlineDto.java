package com.flightapp.AirlineDetailsService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AirlineDto {
	
	private String airlineId;
	private String airlineName;
	private String airlineLogo;
	private String airlineContactNumber;
	private String airlineAddress;
	

}
