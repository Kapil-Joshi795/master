package com.flights.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.flights.api.model.FlightError;

@ControllerAdvice
public class FlightExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<FlightError> handleException(RecordNotFoundException fe){
		FlightError errorResponse = new FlightError();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(fe.getMessage());
        errorResponse.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<FlightError>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
