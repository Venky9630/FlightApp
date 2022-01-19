package com.flightapp.AirlineDetailsService.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class FileStorageException extends RuntimeException{

    String message;
}
