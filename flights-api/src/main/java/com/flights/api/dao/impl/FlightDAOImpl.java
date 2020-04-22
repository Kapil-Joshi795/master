package com.flights.api.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flights.api.dao.FlightDAO;
import com.flights.api.dao.FlightRepository;
import com.flights.api.model.Flights;

@Repository
public class FlightDAOImpl implements FlightDAO {

	@Autowired
	FlightRepository flightReository;
	
	public List<Flights> getFlightsDetails() {
		return flightReository.findAll();
	}

}
