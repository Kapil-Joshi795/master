package com.travelport.api.model;

import java.time.LocalDateTime;

public class TravelportModel {
	
	private String flightId;
	private String flightName;
	private String departure;
	private String arrival;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private Long seatsAvl;
	
	public TravelportModel() {
		super();
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}
	
	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Long getSeatsAvl() {
		return seatsAvl;
	}

	public void setSeatsAvl(Long seatsAvl) {
		this.seatsAvl = seatsAvl;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
}
