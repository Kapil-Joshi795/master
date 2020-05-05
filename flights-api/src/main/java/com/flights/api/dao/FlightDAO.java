package com.flights.api.dao;

import com.flights.api.model.FlightsList;

public interface FlightDAO{

	public FlightsList getFlightsDetails();
	
	public FlightsList addFlightsDetails(FlightsList flightsList);
	
	public void cancelFlight(Long flightId);
}
