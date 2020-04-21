package com.flights.api.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flights.api.model.Flights;

@RestController
@RequestMapping("/flights")
public class FlightsController {
	
	@GetMapping("/getDetails")
	public List<Flights> getFlightsDetails()
	{
		List<Flights> flightsList = new ArrayList();
			Flights flights1 = new Flights();
			flights1.setFlightId("1001");
			flights1.setFlightName("Vistara UK-963");
			flights1.setDeparture("DEL");
			flights1.setArrival("NYK");
			flights1.setArrivalTime(LocalDateTime.of(2020, 04, 22, 22, 40, 00));
			flights1.setDepartureTime(LocalDateTime.of(2020, 04, 22, 8, 45, 00));
			flights1.setSeatsAvl(80);
			flightsList.add(flights1);
			
			Flights flights2 = new Flights();
			flights2.setFlightId("1002");
			flights2.setFlightName("Vistara UK-981");
			flights2.setDeparture("DEL");
			flights2.setArrival("NYK");
			flights2.setArrivalTime(LocalDateTime.of(2020, 04, 23, 11, 20, 00));
			flights2.setDepartureTime(LocalDateTime.of(2020, 04, 22, 21, 10, 00));
			flights2.setSeatsAvl(80);
			flightsList.add(flights2);
			
			Flights flights3 = new Flights();
			flights3.setFlightId("1003");
			flights3.setFlightName("Vistara UK-183");
			flights3.setDeparture("DEL");
			flights3.setArrival("NYK");
			flights3.setArrivalTime(LocalDateTime.of(2020, 04, 23, 11, 20, 00));
			flights3.setDepartureTime(LocalDateTime.of(2020, 04, 22, 21, 10, 00));
			flights3.setSeatsAvl(80);
			flightsList.add(flights3);
		return flightsList;
	}
}
