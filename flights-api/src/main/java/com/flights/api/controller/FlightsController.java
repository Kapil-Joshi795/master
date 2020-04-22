package com.flights.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flights.api.exception.RecordNotFoundException;
import com.flights.api.model.Flights;
import com.flights.api.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightsController{
	
	@Autowired
	FlightService flightService;
	
	@GetMapping("/getDetails")
	public ResponseEntity<List<Flights>> getFlightsDetails() 
	{
		List<Flights> flightList = new ArrayList();
		flightList = flightService.getFlightsDetails();
		if(flightList.size()<1) throw new RecordNotFoundException("No Flight Available");
		return new ResponseEntity<List<Flights>>(flightList, HttpStatus.OK);
	}
}
