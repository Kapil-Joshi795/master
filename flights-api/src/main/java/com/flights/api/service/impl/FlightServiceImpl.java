package com.flights.api.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.api.dao.FlightDAO;
import com.flights.api.model.Flights;
import com.flights.api.service.FlightService;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightDAO flightDAO;
	
	public List<Flights> getFlightsDetails()
	{
		return flightDAO.getFlightsDetails();
	}

}
