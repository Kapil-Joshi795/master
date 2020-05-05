package com.flights.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flights.api.model.FlightsList;
import com.flights.api.service.FlightService;

@RestController
@RequestMapping("/flights")
public class FlightsController{
	
	@Autowired
	FlightService flightService;
	
	@GetMapping("/getDetails")
	public ResponseEntity<FlightsList> getFlightsDetails() 
	{
		return new ResponseEntity<FlightsList>(flightService.getFlightsDetails(), HttpStatus.OK);
	}
	
	@PostMapping(value="add_flights_details", consumes=MediaType.APPLICATION_XML_VALUE, produces=MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<FlightsList> addFlightsDetails(@RequestBody FlightsList flightsList)
	{
		return new ResponseEntity<FlightsList>(flightService.addFlightsDetails(flightsList), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/cancelFlight",consumes=MediaType.APPLICATION_XML_VALUE, produces=MediaType.APPLICATION_XML_VALUE)
	public ResponseEntity<Void> cancelFlight(@RequestParam Long flightId)
	{
		flightService.cancelFlight(flightId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}

