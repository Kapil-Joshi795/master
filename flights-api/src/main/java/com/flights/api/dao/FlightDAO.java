package com.flights.api.dao;

import java.util.List;

import com.flights.api.model.Flights;

public interface FlightDAO{

	public List<Flights> getFlightsDetails();
}
