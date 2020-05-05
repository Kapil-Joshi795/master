package com.flights.api.service;

import com.flights.api.model.FlightsList;

public interface FlightService {

	public FlightsList getFlightsDetails();
	
	public FlightsList addFlightsDetails(FlightsList flightsList);
	
	public void cancelFlight(Long flightId);
}
