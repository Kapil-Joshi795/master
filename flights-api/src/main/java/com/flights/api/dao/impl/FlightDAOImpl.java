package com.flights.api.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flights.api.dao.FlightDAO;
import com.flights.api.dao.FlightRepository;
import com.flights.api.model.Flights;
import com.flights.api.model.FlightsList;

@Repository
public class FlightDAOImpl implements FlightDAO {

	@Autowired
	FlightRepository flightReository;
	
	public FlightsList getFlightsDetails() {
		FlightsList flightsList = new FlightsList();
		flightsList.setFlightList(flightReository.findAll());
		return flightsList;
	}

	public FlightsList addFlightsDetails(FlightsList flightsList) {
		for(Flights flight : flightsList.getFlightList())
		{
			flightReository.save(flight);
		}
		FlightsList flightlist = new FlightsList();
		flightlist.setFlightList(flightReository.findAll());
		return flightlist;
	}

	public void cancelFlight(Long flightId) {
		flightReository.deleteById(flightId);
	}

}
