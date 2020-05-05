package com.flights.api.model;







import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@Entity
@JacksonXmlRootElement(localName="Flights")
public class Flights {
	
	@Id
	@Column(name="flight_id")
	@JacksonXmlProperty(isAttribute = true)
	private Long flightId;
	
	@Column(name="flight_name")
	@NotNull
	@JacksonXmlProperty
	private String flightName;
	
	@NotNull
	@JacksonXmlProperty
	private String departure;
	
	@NotNull
	@JacksonXmlProperty
	private String arrival;

	@Column(name="departure_Date")
	@JacksonXmlProperty
	private Date departureDate;
	
	@Column(name="departure_Time")
	@JacksonXmlProperty
	private Time departureTime;
	
	@Column(name="arrival_Date")
	@JacksonXmlProperty
	private Date arrivalDate;
	
	@Column(name="arrival_Time")
	@JacksonXmlProperty
	private Time arrivalTime;
	
	@Column(name="seats_Avl")
	@NotNull
	@JacksonXmlProperty
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

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Long getSeatsAvl() {
		return seatsAvl;
	}

	public void setSeatsAvl(Long seatsAvl) {
		this.seatsAvl = seatsAvl;
	}
}
