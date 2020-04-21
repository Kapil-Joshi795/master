package com.flights.api.model;

import java.time.LocalDateTime;

public class Flights {

	private String flightId;
	private String flightName;
	private String departure;
	private String arrival;
	private LocalDateTime departureTime;
	private LocalDateTime arrivalTime;
	private Integer seatsAvl;
	
	public Flights() {
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

	public void setArrival(String arrival) {
		this.arrival = arrival;
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

	public void setArrivalTime(LocalDateTime arrvalTime) {
		this.arrivalTime = arrvalTime;
	}

	public Integer getSeatsAvl() {
		return seatsAvl;
	}

	public void setSeatsAvl(Integer seatsAvl) {
		this.seatsAvl = seatsAvl;
	}
}
