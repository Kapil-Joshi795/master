package com.flights.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Flights {
	
	@Id
	@GeneratedValue
	@Column(name="flight_id")
	private Long flightId;
	
	@Column(name="flight_name")
	@NotNull
	private String flightName;
	
	@NotNull
	private String departure;
	
	@NotNull
	private String arrival;

	@DateTimeFormat
	@Column(name="departure_Time")
	private LocalDateTime departureTime;
	
	@DateTimeFormat
	@Column(name="arrival_Time")
	private LocalDateTime arrivalTime;
	
	@Column(name="seats_Avl")
	@NotNull
	private Long seatsAvl;
	
	public Flights() {
		super();
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
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

	public Long getSeatsAvl() {
		return seatsAvl;
	}

	public void setSeatsAvl(Long seatsAvl) {
		this.seatsAvl = seatsAvl;
	}
}
