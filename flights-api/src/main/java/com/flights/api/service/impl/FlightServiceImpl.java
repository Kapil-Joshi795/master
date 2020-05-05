package com.flights.api.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flights.api.dao.FlightDAO;
import com.flights.api.model.FlightsList;
import com.flights.api.service.FlightService;

@Service
@Transactional
public class FlightServiceImpl implements FlightService{

	@Autowired
	FlightDAO flightDAO;
	
	public FlightsList getFlightsDetails()
	{
		FlightsList flightList = flightDAO.getFlightsDetails();
		return flightList;
	}

	public FlightsList addFlightsDetails(FlightsList flightsList) {
		return flightDAO.addFlightsDetails(flightsList);
	}

	public void cancelFlight(Long flightId) {
		flightDAO.cancelFlight(flightId);
	}

}
